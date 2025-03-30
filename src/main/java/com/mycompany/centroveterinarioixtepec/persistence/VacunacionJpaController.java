package com.mycompany.centroveterinarioixtepec.persistence;

import com.mycompany.centroveterinarioixtepec.entidades.Vacunacion;
import com.mycompany.centroveterinarioixtepec.persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class VacunacionJpaController implements Serializable {

    public VacunacionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public VacunacionJpaController() {
        emf = Persistence.createEntityManagerFactory("DB_CentroVeterinarioIxtepecPU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Vacunacion vacunacion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(vacunacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Vacunacion vacunacion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            vacunacion = em.merge(vacunacion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = vacunacion.getIdVacunacion();
                if (findVacunacion(id) == null) {
                    throw new NonexistentEntityException("The vacunacion with id " + id + " no longer exists.");
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
            Vacunacion vacunacion;
            try {
                vacunacion = em.getReference(Vacunacion.class, id);
                vacunacion.getIdVacunacion();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The vacunacion with id " + id + " no longer exists.", enfe);
            }
            em.remove(vacunacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Vacunacion> findVacunacionEntities() {
        return findVacunacionEntities(true, -1, -1);
    }

    public List<Vacunacion> findVacunacionEntities(int maxResults, int firstResult) {
        return findVacunacionEntities(false, maxResults, firstResult);
    }

    private List<Vacunacion> findVacunacionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Vacunacion.class));
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

    public Vacunacion findVacunacion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Vacunacion.class, id);
        } finally {
            em.close();
        }
    }

    public int getVacunacionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Vacunacion> rt = cq.from(Vacunacion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<Vacunacion> findVacunacionEntities(String nombreBuscado) {

        EntityManager em = getEntityManager();
        try {
            String consulta = "SELECT d FROM Vacunacion d WHERE d.mascota.nombre LIKE :nombre";
            TypedQuery<Vacunacion> query = em.createQuery(consulta, Vacunacion.class);
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

    public List<Vacunacion> findVacunacionEntities2(String clave) {

        EntityManager em = getEntityManager();
        try {
            String consulta = "SELECT d FROM Vacunacion d JOIN d.mascota m JOIN m.cliente c WHERE c.clave = :clave";
            TypedQuery<Vacunacion> query = em.createQuery(consulta, Vacunacion.class);
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
