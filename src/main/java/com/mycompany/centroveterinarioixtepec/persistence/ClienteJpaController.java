package com.mycompany.centroveterinarioixtepec.persistence;

import com.mycompany.centroveterinarioixtepec.entidades.Cliente;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.centroveterinarioixtepec.entidades.Mascota;
import com.mycompany.centroveterinarioixtepec.persistence.exceptions.NonexistentEntityException;
import com.mycompany.centroveterinarioixtepec.persistence.exceptions.PreexistingEntityException;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ClienteJpaController implements Serializable {

    public ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public ClienteJpaController() {
        emf = Persistence.createEntityManagerFactory("DB_CentroVeterinarioIxtepecPU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cliente cliente) throws PreexistingEntityException, Exception {
        if (cliente.getListaMascotas() == null) {
            cliente.setListaMascotas(new LinkedList<Mascota>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            LinkedList<Mascota> attachedListaMascotas = new LinkedList<Mascota>();
            for (Mascota listaMascotasMascotaToAttach : cliente.getListaMascotas()) {
                listaMascotasMascotaToAttach = em.getReference(listaMascotasMascotaToAttach.getClass(), listaMascotasMascotaToAttach.getIdMascota());
                attachedListaMascotas.add(listaMascotasMascotaToAttach);
            }
            cliente.setListaMascotas(attachedListaMascotas);
            em.persist(cliente);
            for (Mascota listaMascotasMascota : cliente.getListaMascotas()) {
                Cliente oldClienteOfListaMascotasMascota = listaMascotasMascota.getCliente();
                listaMascotasMascota.setCliente(cliente);
                listaMascotasMascota = em.merge(listaMascotasMascota);
                if (oldClienteOfListaMascotasMascota != null) {
                    oldClienteOfListaMascotasMascota.getListaMascotas().remove(listaMascotasMascota);
                    oldClienteOfListaMascotasMascota = em.merge(oldClienteOfListaMascotasMascota);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCliente(cliente.getIdCliente()) != null) {
                throw new PreexistingEntityException("Cliente " + cliente + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cliente cliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente persistentCliente = em.find(Cliente.class, cliente.getIdCliente());
            LinkedList<Mascota> listaMascotasOld = persistentCliente.getListaMascotas();
            LinkedList<Mascota> listaMascotasNew = cliente.getListaMascotas();
            LinkedList<Mascota> attachedListaMascotasNew = new LinkedList<Mascota>();
            for (Mascota listaMascotasNewMascotaToAttach : listaMascotasNew) {
                listaMascotasNewMascotaToAttach = em.getReference(listaMascotasNewMascotaToAttach.getClass(), listaMascotasNewMascotaToAttach.getIdMascota());
                attachedListaMascotasNew.add(listaMascotasNewMascotaToAttach);
            }
            listaMascotasNew = attachedListaMascotasNew;
            cliente.setListaMascotas(listaMascotasNew);
            cliente = em.merge(cliente);
            for (Mascota listaMascotasOldMascota : listaMascotasOld) {
                if (!listaMascotasNew.contains(listaMascotasOldMascota)) {
                    listaMascotasOldMascota.setCliente(null);
                    listaMascotasOldMascota = em.merge(listaMascotasOldMascota);
                }
            }
            for (Mascota listaMascotasNewMascota : listaMascotasNew) {
                if (!listaMascotasOld.contains(listaMascotasNewMascota)) {
                    Cliente oldClienteOfListaMascotasNewMascota = listaMascotasNewMascota.getCliente();
                    listaMascotasNewMascota.setCliente(cliente);
                    listaMascotasNewMascota = em.merge(listaMascotasNewMascota);
                    if (oldClienteOfListaMascotasNewMascota != null && !oldClienteOfListaMascotasNewMascota.equals(cliente)) {
                        oldClienteOfListaMascotasNewMascota.getListaMascotas().remove(listaMascotasNewMascota);
                        oldClienteOfListaMascotasNewMascota = em.merge(oldClienteOfListaMascotasNewMascota);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cliente.getIdCliente();
                if (findCliente(id) == null) {
                    throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getIdCliente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            LinkedList<Mascota> listaMascotas = cliente.getListaMascotas();
            for (Mascota listaMascotasMascota : listaMascotas) {
                listaMascotasMascota.setCliente(null);
                listaMascotasMascota = em.merge(listaMascotasMascota);
            }
            em.remove(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cliente> findClienteEntities() {
        return findClienteEntities(true, -1, -1);
    }

    public List<Cliente> findClienteEntities(int maxResults, int firstResult) {
        return findClienteEntities(false, maxResults, firstResult);
    }

    private List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Cliente findCliente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<Cliente> findClienteEntities(String nombreBuscado) {
        EntityManager em = getEntityManager();
        try {
            String consulta = "SELECT u FROM Cliente u WHERE CONCAT(u.nombre, ' ', u.apePaterno, ' ',u.apeMaterno) LIKE :nombre";
            TypedQuery<Cliente> query = em.createQuery(consulta, Cliente.class);
            query.setParameter("nombre", "%" + nombreBuscado + "%");
            return query.getResultList();
        } catch (NoResultException e) {
            // Manejar la excepción de no encontrar un usuario con los datos proporcionados
            return null;
        } catch (Exception e) {
            // Manejar otras excepciones que puedan ocurrir durante la ejecución de la consulta
            throw new RuntimeException(e);
        } finally {
            em.close();
        }
    }

    public List<Cliente> findClienteClave(String clave) {
        EntityManager em = getEntityManager();
        try {
            String consulta = "SELECT c FROM Cliente c WHERE c.clave = :clave";
            TypedQuery<Cliente> query = em.createQuery(consulta, Cliente.class);
            query.setParameter("clave", clave);
            return query.getResultList();
        } catch (NoResultException e) {
            // Manejar la excepción de no encontrar un usuario con los datos proporcionados
            return null;
        } catch (Exception e) {
            // Manejar otras excepciones que puedan ocurrir durante la ejecución de la consulta
            throw new RuntimeException(e);
        } finally {
            em.close();
        }
    }

    public String traerUltimaClave(String prefijo) {
        EntityManager em = getEntityManager();
        try {
            String consulta = "SELECT c.clave FROM Cliente c WHERE c.clave LIKE :prefijo ORDER BY c.clave DESC";
            TypedQuery<String> query = em.createQuery(consulta, String.class);
            query.setParameter("prefijo", prefijo + "%");
            query.setMaxResults(1);
            List<String> resultados = query.getResultList();
            return resultados.isEmpty() ? null : resultados.get(0);
        } catch (NoResultException e) {
            // Manejar la excepción de no encontrar un usuario con los datos proporcionados
            return null;
        } catch (Exception e) {
            // Manejar otras excepciones que puedan ocurrir durante la ejecución de la consulta
            throw new RuntimeException(e);
        } finally {
            em.close();
        }
    }

}
