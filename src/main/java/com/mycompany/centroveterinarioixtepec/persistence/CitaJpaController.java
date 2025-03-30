package com.mycompany.centroveterinarioixtepec.persistence;

import com.mycompany.centroveterinarioixtepec.entidades.Cita;
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

public class CitaJpaController implements Serializable {

    public CitaJpaController() {
        emf = Persistence.createEntityManagerFactory("DB_CentroVeterinarioIxtepecPU");
    }
    
    public CitaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cita cita) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Mascota mascota = cita.getMascota();
            if (mascota != null) {
                mascota = em.getReference(mascota.getClass(), mascota.getIdMascota());
                cita.setMascota(mascota);
            }
            em.persist(cita);
            if (mascota != null) {
                mascota.getListaCita().add(cita);
                mascota = em.merge(mascota);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cita cita) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cita persistentCita = em.find(Cita.class, cita.getIdCita());
            Mascota mascotaOld = persistentCita.getMascota();
            Mascota mascotaNew = cita.getMascota();
            if (mascotaNew != null) {
                mascotaNew = em.getReference(mascotaNew.getClass(), mascotaNew.getIdMascota());
                cita.setMascota(mascotaNew);
            }
            cita = em.merge(cita);
            if (mascotaOld != null && !mascotaOld.equals(mascotaNew)) {
                mascotaOld.getListaCita().remove(cita);
                mascotaOld = em.merge(mascotaOld);
            }
            if (mascotaNew != null && !mascotaNew.equals(mascotaOld)) {
                mascotaNew.getListaCita().add(cita);
                mascotaNew = em.merge(mascotaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cita.getIdCita();
                if (findCita(id) == null) {
                    throw new NonexistentEntityException("The cita with id " + id + " no longer exists.");
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
            Cita cita;
            try {
                cita = em.getReference(Cita.class, id);
                cita.getIdCita();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cita with id " + id + " no longer exists.", enfe);
            }
            Mascota mascota = cita.getMascota();
            if (mascota != null) {
                mascota.getListaCita().remove(cita);
                mascota = em.merge(mascota);
            }
            em.remove(cita);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cita> findCitaEntities() {
        return findCitaEntities(true, -1, -1);
    }

    public List<Cita> findCitaEntities(int maxResults, int firstResult) {
        return findCitaEntities(false, maxResults, firstResult);
    }

    private List<Cita> findCitaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cita.class));
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

    public Cita findCita(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cita.class, id);
        } finally {
            em.close();
        }
    }

    public int getCitaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cita> rt = cq.from(Cita.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<Cita> traerCitas(String fechaAValidar) {
        EntityManager em = getEntityManager();
        try {
            String consulta = "SELECT u FROM Cita u WHERE u.fecha = :fechaAValidar";
            TypedQuery<Cita> query = em.createQuery(consulta, Cita.class);
            query.setParameter("fechaAValidar", fechaAValidar);
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
    
}
