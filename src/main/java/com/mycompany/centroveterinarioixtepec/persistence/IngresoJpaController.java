package com.mycompany.centroveterinarioixtepec.persistence;

import com.mycompany.centroveterinarioixtepec.entidades.Ingreso;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.centroveterinarioixtepec.entidades.Mascota;
import com.mycompany.centroveterinarioixtepec.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class IngresoJpaController implements Serializable {

    public IngresoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public IngresoJpaController() {
        emf = Persistence.createEntityManagerFactory("DB_CentroVeterinarioIxtepecPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Ingreso ingreso) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Mascota mascota = ingreso.getMascota();
            if (mascota != null) {
                mascota = em.getReference(mascota.getClass(), mascota.getIdMascota());
                ingreso.setMascota(mascota);
            }
            em.persist(ingreso);
            if (mascota != null) {
                mascota.getListaIngreso().add(ingreso);
                mascota = em.merge(mascota);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Ingreso ingreso) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Ingreso persistentIngreso = em.find(Ingreso.class, ingreso.getIdIngreso());
            Mascota mascotaOld = persistentIngreso.getMascota();
            Mascota mascotaNew = ingreso.getMascota();
            if (mascotaNew != null) {
                mascotaNew = em.getReference(mascotaNew.getClass(), mascotaNew.getIdMascota());
                ingreso.setMascota(mascotaNew);
            }
            ingreso = em.merge(ingreso);
            if (mascotaOld != null && !mascotaOld.equals(mascotaNew)) {
                mascotaOld.getListaIngreso().remove(ingreso);
                mascotaOld = em.merge(mascotaOld);
            }
            if (mascotaNew != null && !mascotaNew.equals(mascotaOld)) {
                mascotaNew.getListaIngreso().add(ingreso);
                mascotaNew = em.merge(mascotaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = ingreso.getIdIngreso();
                if (findIngreso(id) == null) {
                    throw new NonexistentEntityException("The ingreso with id " + id + " no longer exists.");
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
            Ingreso ingreso;
            try {
                ingreso = em.getReference(Ingreso.class, id);
                ingreso.getIdIngreso();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ingreso with id " + id + " no longer exists.", enfe);
            }
            Mascota mascota = ingreso.getMascota();
            if (mascota != null) {
                mascota.getListaIngreso().remove(ingreso);
                mascota = em.merge(mascota);
            }
            em.remove(ingreso);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Ingreso> findIngresoEntities() {
        return findIngresoEntities(true, -1, -1);
    }

    public List<Ingreso> findIngresoEntities(int maxResults, int firstResult) {
        return findIngresoEntities(false, maxResults, firstResult);
    }

    private List<Ingreso> findIngresoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Ingreso.class));
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

    public Ingreso findIngreso(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Ingreso.class, id);
        } finally {
            em.close();
        }
    }

    public int getIngresoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Ingreso> rt = cq.from(Ingreso.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<Ingreso> findIngresoEntities(String nombreBuscado) {
        EntityManager em = getEntityManager();
        try {
            String consulta = "SELECT i FROM Ingreso i WHERE i.mascota.nombre LIKE :nombre";
            TypedQuery<Ingreso> query = em.createQuery(consulta, Ingreso.class);
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

    public List<Ingreso> findIngresoEntities2(String clave) {
        EntityManager em = getEntityManager();
        try {
            String consulta = "SELECT i FROM Ingreso i JOIN i.mascota m JOIN m.cliente c WHERE c.clave = :clave";
            TypedQuery<Ingreso> query = em.createQuery(consulta, Ingreso.class);
            query.setParameter("clave", clave);
            return query.getResultList();
        } catch (NoResultException e) {
            // Manejar la excepción de no encontrar usuario
            return null;
        } catch (Exception e) {
            // Manejar otras excepciones durante la ejecución de la consulta
            throw new RuntimeException(e);
        } finally {
            em.close();
        }
    }
    
}
