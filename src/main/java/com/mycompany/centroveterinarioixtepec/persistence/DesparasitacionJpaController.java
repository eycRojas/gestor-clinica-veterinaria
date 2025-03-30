package com.mycompany.centroveterinarioixtepec.persistence;

import com.mycompany.centroveterinarioixtepec.entidades.Desparasitacion;
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

public class DesparasitacionJpaController implements Serializable {

    public DesparasitacionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public DesparasitacionJpaController() {
        emf = Persistence.createEntityManagerFactory("DB_CentroVeterinarioIxtepecPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Desparasitacion desparasitacion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Mascota mascota = desparasitacion.getMascota();
            if (mascota != null) {
                mascota = em.getReference(mascota.getClass(), mascota.getIdMascota());
                desparasitacion.setMascota(mascota);
            }
            em.persist(desparasitacion);
            if (mascota != null) {
                mascota.getListaDesparasitacion().add(desparasitacion);
                mascota = em.merge(mascota);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Desparasitacion desparasitacion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Desparasitacion persistentDesparasitacion = em.find(Desparasitacion.class, desparasitacion.getIdDesparasitante());
            Mascota mascotaOld = persistentDesparasitacion.getMascota();
            Mascota mascotaNew = desparasitacion.getMascota();
            if (mascotaNew != null) {
                mascotaNew = em.getReference(mascotaNew.getClass(), mascotaNew.getIdMascota());
                desparasitacion.setMascota(mascotaNew);
            }
            desparasitacion = em.merge(desparasitacion);
            if (mascotaOld != null && !mascotaOld.equals(mascotaNew)) {
                mascotaOld.getListaDesparasitacion().remove(desparasitacion);
                mascotaOld = em.merge(mascotaOld);
            }
            if (mascotaNew != null && !mascotaNew.equals(mascotaOld)) {
                mascotaNew.getListaDesparasitacion().add(desparasitacion);
                mascotaNew = em.merge(mascotaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = desparasitacion.getIdDesparasitante();
                if (findDesparasitacion(id) == null) {
                    throw new NonexistentEntityException("The desparasitacion with id " + id + " no longer exists.");
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
            Desparasitacion desparasitacion;
            try {
                desparasitacion = em.getReference(Desparasitacion.class, id);
                desparasitacion.getIdDesparasitante();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The desparasitacion with id " + id + " no longer exists.", enfe);
            }
            Mascota mascota = desparasitacion.getMascota();
            if (mascota != null) {
                mascota.getListaDesparasitacion().remove(desparasitacion);
                mascota = em.merge(mascota);
            }
            em.remove(desparasitacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Desparasitacion> findDesparasitacionEntities() {
        return findDesparasitacionEntities(true, -1, -1);
    }

    public List<Desparasitacion> findDesparasitacionEntities(int maxResults, int firstResult) {
        return findDesparasitacionEntities(false, maxResults, firstResult);
    }

    private List<Desparasitacion> findDesparasitacionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Desparasitacion.class));
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

    public Desparasitacion findDesparasitacion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Desparasitacion.class, id);
        } finally {
            em.close();
        }
    }

    public int getDesparasitacionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Desparasitacion> rt = cq.from(Desparasitacion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<Desparasitacion> findDesparasitacionEntities(String nombreBuscado) {
        
        EntityManager em = getEntityManager();
        try {
            String consulta = "SELECT d FROM Desparasitacion d WHERE d.mascota.nombre LIKE :nombre";
            TypedQuery<Desparasitacion> query = em.createQuery(consulta, Desparasitacion.class);
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
    
    public List<Desparasitacion> findDesparasitacionEntities2(String clave) {
        
        EntityManager em = getEntityManager();
        try {
            String consulta = "SELECT d FROM Desparasitacion d JOIN d.mascota m JOIN m.cliente c WHERE c.clave = :clave";
            TypedQuery<Desparasitacion> query = em.createQuery(consulta, Desparasitacion.class);
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
