package com.mycompany.centroveterinarioixtepec.persistence;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.centroveterinarioixtepec.entidades.Cliente;
import com.mycompany.centroveterinarioixtepec.entidades.Desparasitacion;
import java.util.LinkedList;
import com.mycompany.centroveterinarioixtepec.entidades.Vacunacion;
import com.mycompany.centroveterinarioixtepec.entidades.Ingreso;
import com.mycompany.centroveterinarioixtepec.entidades.Cita;
import com.mycompany.centroveterinarioixtepec.entidades.Mascota;
import com.mycompany.centroveterinarioixtepec.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class MascotaJpaController implements Serializable {

    public MascotaJpaController(){
        emf = Persistence.createEntityManagerFactory("DB_CentroVeterinarioIxtepecPU");
    }
    
    public MascotaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Mascota mascota) {
        if (mascota.getListaDesparasitacion() == null) {
            mascota.setListaDesparasitacion(new LinkedList<Desparasitacion>());
        }
        if (mascota.getListaVacunacion() == null) {
            mascota.setListaVacunacion(new LinkedList<Vacunacion>());
        }
        if (mascota.getListaIngreso() == null) {
            mascota.setListaIngreso(new LinkedList<Ingreso>());
        }
        if (mascota.getListaCita() == null) {
            mascota.setListaCita(new LinkedList<Cita>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente = mascota.getCliente();
            if (cliente != null) {
                cliente = em.getReference(cliente.getClass(), cliente.getIdCliente());
                mascota.setCliente(cliente);
            }
            LinkedList<Desparasitacion> attachedListaDesparasitacion = new LinkedList<Desparasitacion>();
            for (Desparasitacion listaDesparasitacionDesparasitacionToAttach : mascota.getListaDesparasitacion()) {
                listaDesparasitacionDesparasitacionToAttach = em.getReference(listaDesparasitacionDesparasitacionToAttach.getClass(), listaDesparasitacionDesparasitacionToAttach.getIdDesparasitante());
                attachedListaDesparasitacion.add(listaDesparasitacionDesparasitacionToAttach);
            }
            mascota.setListaDesparasitacion(attachedListaDesparasitacion);
            LinkedList<Vacunacion> attachedListaVacunacion = new LinkedList<Vacunacion>();
            for (Vacunacion listaVacunacionVacunacionToAttach : mascota.getListaVacunacion()) {
                listaVacunacionVacunacionToAttach = em.getReference(listaVacunacionVacunacionToAttach.getClass(), listaVacunacionVacunacionToAttach.getIdVacunacion());
                attachedListaVacunacion.add(listaVacunacionVacunacionToAttach);
            }
            mascota.setListaVacunacion(attachedListaVacunacion);
            LinkedList<Ingreso> attachedListaIngreso = new LinkedList<Ingreso>();
            for (Ingreso listaIngresoIngresoToAttach : mascota.getListaIngreso()) {
                listaIngresoIngresoToAttach = em.getReference(listaIngresoIngresoToAttach.getClass(), listaIngresoIngresoToAttach.getIdIngreso());
                attachedListaIngreso.add(listaIngresoIngresoToAttach);
            }
            mascota.setListaIngreso(attachedListaIngreso);
            LinkedList<Cita> attachedListaCita = new LinkedList<Cita>();
            for (Cita listaCitaCitaToAttach : mascota.getListaCita()) {
                listaCitaCitaToAttach = em.getReference(listaCitaCitaToAttach.getClass(), listaCitaCitaToAttach.getIdCita());
                attachedListaCita.add(listaCitaCitaToAttach);
            }
            mascota.setListaCita(attachedListaCita);
            em.persist(mascota);
            if (cliente != null) {
                cliente.getListaMascotas().add(mascota);
                cliente = em.merge(cliente);
            }
            for (Desparasitacion listaDesparasitacionDesparasitacion : mascota.getListaDesparasitacion()) {
                Mascota oldMascotaOfListaDesparasitacionDesparasitacion = listaDesparasitacionDesparasitacion.getMascota();
                listaDesparasitacionDesparasitacion.setMascota(mascota);
                listaDesparasitacionDesparasitacion = em.merge(listaDesparasitacionDesparasitacion);
                if (oldMascotaOfListaDesparasitacionDesparasitacion != null) {
                    oldMascotaOfListaDesparasitacionDesparasitacion.getListaDesparasitacion().remove(listaDesparasitacionDesparasitacion);
                    oldMascotaOfListaDesparasitacionDesparasitacion = em.merge(oldMascotaOfListaDesparasitacionDesparasitacion);
                }
            }
            for (Vacunacion listaVacunacionVacunacion : mascota.getListaVacunacion()) {
                Mascota oldMascotaOfListaVacunacionVacunacion = listaVacunacionVacunacion.getMascota();
                listaVacunacionVacunacion.setMascota(mascota);
                listaVacunacionVacunacion = em.merge(listaVacunacionVacunacion);
                if (oldMascotaOfListaVacunacionVacunacion != null) {
                    oldMascotaOfListaVacunacionVacunacion.getListaVacunacion().remove(listaVacunacionVacunacion);
                    oldMascotaOfListaVacunacionVacunacion = em.merge(oldMascotaOfListaVacunacionVacunacion);
                }
            }
            for (Ingreso listaIngresoIngreso : mascota.getListaIngreso()) {
                Mascota oldMascotaOfListaIngresoIngreso = listaIngresoIngreso.getMascota();
                listaIngresoIngreso.setMascota(mascota);
                listaIngresoIngreso = em.merge(listaIngresoIngreso);
                if (oldMascotaOfListaIngresoIngreso != null) {
                    oldMascotaOfListaIngresoIngreso.getListaIngreso().remove(listaIngresoIngreso);
                    oldMascotaOfListaIngresoIngreso = em.merge(oldMascotaOfListaIngresoIngreso);
                }
            }
            for (Cita listaCitaCita : mascota.getListaCita()) {
                Mascota oldMascotaOfListaCitaCita = listaCitaCita.getMascota();
                listaCitaCita.setMascota(mascota);
                listaCitaCita = em.merge(listaCitaCita);
                if (oldMascotaOfListaCitaCita != null) {
                    oldMascotaOfListaCitaCita.getListaCita().remove(listaCitaCita);
                    oldMascotaOfListaCitaCita = em.merge(oldMascotaOfListaCitaCita);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Mascota mascota) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Mascota persistentMascota = em.find(Mascota.class, mascota.getIdMascota());
            Cliente clienteOld = persistentMascota.getCliente();
            Cliente clienteNew = mascota.getCliente();
            LinkedList<Desparasitacion> listaDesparasitacionOld = persistentMascota.getListaDesparasitacion();
            LinkedList<Desparasitacion> listaDesparasitacionNew = mascota.getListaDesparasitacion();
            LinkedList<Vacunacion> listaVacunacionOld = persistentMascota.getListaVacunacion();
            LinkedList<Vacunacion> listaVacunacionNew = mascota.getListaVacunacion();
            LinkedList<Ingreso> listaIngresoOld = persistentMascota.getListaIngreso();
            LinkedList<Ingreso> listaIngresoNew = mascota.getListaIngreso();
            LinkedList<Cita> listaCitaOld = persistentMascota.getListaCita();
            LinkedList<Cita> listaCitaNew = mascota.getListaCita();
            if (clienteNew != null) {
                clienteNew = em.getReference(clienteNew.getClass(), clienteNew.getIdCliente());
                mascota.setCliente(clienteNew);
            }
            LinkedList<Desparasitacion> attachedListaDesparasitacionNew = new LinkedList<Desparasitacion>();
            for (Desparasitacion listaDesparasitacionNewDesparasitacionToAttach : listaDesparasitacionNew) {
                listaDesparasitacionNewDesparasitacionToAttach = em.getReference(listaDesparasitacionNewDesparasitacionToAttach.getClass(), listaDesparasitacionNewDesparasitacionToAttach.getIdDesparasitante());
                attachedListaDesparasitacionNew.add(listaDesparasitacionNewDesparasitacionToAttach);
            }
            listaDesparasitacionNew = attachedListaDesparasitacionNew;
            mascota.setListaDesparasitacion(listaDesparasitacionNew);
            LinkedList<Vacunacion> attachedListaVacunacionNew = new LinkedList<Vacunacion>();
            for (Vacunacion listaVacunacionNewVacunacionToAttach : listaVacunacionNew) {
                listaVacunacionNewVacunacionToAttach = em.getReference(listaVacunacionNewVacunacionToAttach.getClass(), listaVacunacionNewVacunacionToAttach.getIdVacunacion());
                attachedListaVacunacionNew.add(listaVacunacionNewVacunacionToAttach);
            }
            listaVacunacionNew = attachedListaVacunacionNew;
            mascota.setListaVacunacion(listaVacunacionNew);
            LinkedList<Ingreso> attachedListaIngresoNew = new LinkedList<Ingreso>();
            for (Ingreso listaIngresoNewIngresoToAttach : listaIngresoNew) {
                listaIngresoNewIngresoToAttach = em.getReference(listaIngresoNewIngresoToAttach.getClass(), listaIngresoNewIngresoToAttach.getIdIngreso());
                attachedListaIngresoNew.add(listaIngresoNewIngresoToAttach);
            }
            listaIngresoNew = attachedListaIngresoNew;
            mascota.setListaIngreso(listaIngresoNew);
            LinkedList<Cita> attachedListaCitaNew = new LinkedList<Cita>();
            for (Cita listaCitaNewCitaToAttach : listaCitaNew) {
                listaCitaNewCitaToAttach = em.getReference(listaCitaNewCitaToAttach.getClass(), listaCitaNewCitaToAttach.getIdCita());
                attachedListaCitaNew.add(listaCitaNewCitaToAttach);
            }
            listaCitaNew = attachedListaCitaNew;
            mascota.setListaCita(listaCitaNew);
            mascota = em.merge(mascota);
            if (clienteOld != null && !clienteOld.equals(clienteNew)) {
                clienteOld.getListaMascotas().remove(mascota);
                clienteOld = em.merge(clienteOld);
            }
            if (clienteNew != null && !clienteNew.equals(clienteOld)) {
                clienteNew.getListaMascotas().add(mascota);
                clienteNew = em.merge(clienteNew);
            }
            for (Desparasitacion listaDesparasitacionOldDesparasitacion : listaDesparasitacionOld) {
                if (!listaDesparasitacionNew.contains(listaDesparasitacionOldDesparasitacion)) {
                    listaDesparasitacionOldDesparasitacion.setMascota(null);
                    listaDesparasitacionOldDesparasitacion = em.merge(listaDesparasitacionOldDesparasitacion);
                }
            }
            for (Desparasitacion listaDesparasitacionNewDesparasitacion : listaDesparasitacionNew) {
                if (!listaDesparasitacionOld.contains(listaDesparasitacionNewDesparasitacion)) {
                    Mascota oldMascotaOfListaDesparasitacionNewDesparasitacion = listaDesparasitacionNewDesparasitacion.getMascota();
                    listaDesparasitacionNewDesparasitacion.setMascota(mascota);
                    listaDesparasitacionNewDesparasitacion = em.merge(listaDesparasitacionNewDesparasitacion);
                    if (oldMascotaOfListaDesparasitacionNewDesparasitacion != null && !oldMascotaOfListaDesparasitacionNewDesparasitacion.equals(mascota)) {
                        oldMascotaOfListaDesparasitacionNewDesparasitacion.getListaDesparasitacion().remove(listaDesparasitacionNewDesparasitacion);
                        oldMascotaOfListaDesparasitacionNewDesparasitacion = em.merge(oldMascotaOfListaDesparasitacionNewDesparasitacion);
                    }
                }
            }
            for (Vacunacion listaVacunacionOldVacunacion : listaVacunacionOld) {
                if (!listaVacunacionNew.contains(listaVacunacionOldVacunacion)) {
                    listaVacunacionOldVacunacion.setMascota(null);
                    listaVacunacionOldVacunacion = em.merge(listaVacunacionOldVacunacion);
                }
            }
            for (Vacunacion listaVacunacionNewVacunacion : listaVacunacionNew) {
                if (!listaVacunacionOld.contains(listaVacunacionNewVacunacion)) {
                    Mascota oldMascotaOfListaVacunacionNewVacunacion = listaVacunacionNewVacunacion.getMascota();
                    listaVacunacionNewVacunacion.setMascota(mascota);
                    listaVacunacionNewVacunacion = em.merge(listaVacunacionNewVacunacion);
                    if (oldMascotaOfListaVacunacionNewVacunacion != null && !oldMascotaOfListaVacunacionNewVacunacion.equals(mascota)) {
                        oldMascotaOfListaVacunacionNewVacunacion.getListaVacunacion().remove(listaVacunacionNewVacunacion);
                        oldMascotaOfListaVacunacionNewVacunacion = em.merge(oldMascotaOfListaVacunacionNewVacunacion);
                    }
                }
            }
            for (Ingreso listaIngresoOldIngreso : listaIngresoOld) {
                if (!listaIngresoNew.contains(listaIngresoOldIngreso)) {
                    listaIngresoOldIngreso.setMascota(null);
                    listaIngresoOldIngreso = em.merge(listaIngresoOldIngreso);
                }
            }
            for (Ingreso listaIngresoNewIngreso : listaIngresoNew) {
                if (!listaIngresoOld.contains(listaIngresoNewIngreso)) {
                    Mascota oldMascotaOfListaIngresoNewIngreso = listaIngresoNewIngreso.getMascota();
                    listaIngresoNewIngreso.setMascota(mascota);
                    listaIngresoNewIngreso = em.merge(listaIngresoNewIngreso);
                    if (oldMascotaOfListaIngresoNewIngreso != null && !oldMascotaOfListaIngresoNewIngreso.equals(mascota)) {
                        oldMascotaOfListaIngresoNewIngreso.getListaIngreso().remove(listaIngresoNewIngreso);
                        oldMascotaOfListaIngresoNewIngreso = em.merge(oldMascotaOfListaIngresoNewIngreso);
                    }
                }
            }
            for (Cita listaCitaOldCita : listaCitaOld) {
                if (!listaCitaNew.contains(listaCitaOldCita)) {
                    listaCitaOldCita.setMascota(null);
                    listaCitaOldCita = em.merge(listaCitaOldCita);
                }
            }
            for (Cita listaCitaNewCita : listaCitaNew) {
                if (!listaCitaOld.contains(listaCitaNewCita)) {
                    Mascota oldMascotaOfListaCitaNewCita = listaCitaNewCita.getMascota();
                    listaCitaNewCita.setMascota(mascota);
                    listaCitaNewCita = em.merge(listaCitaNewCita);
                    if (oldMascotaOfListaCitaNewCita != null && !oldMascotaOfListaCitaNewCita.equals(mascota)) {
                        oldMascotaOfListaCitaNewCita.getListaCita().remove(listaCitaNewCita);
                        oldMascotaOfListaCitaNewCita = em.merge(oldMascotaOfListaCitaNewCita);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = mascota.getIdMascota();
                if (findMascota(id) == null) {
                    throw new NonexistentEntityException("The mascota with id " + id + " no longer exists.");
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
            Mascota mascota;
            try {
                mascota = em.getReference(Mascota.class, id);
                mascota.getIdMascota();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The mascota with id " + id + " no longer exists.", enfe);
            }
            Cliente cliente = mascota.getCliente();
            if (cliente != null) {
                cliente.getListaMascotas().remove(mascota);
                cliente = em.merge(cliente);
            }
            LinkedList<Desparasitacion> listaDesparasitacion = mascota.getListaDesparasitacion();
            for (Desparasitacion listaDesparasitacionDesparasitacion : listaDesparasitacion) {
                listaDesparasitacionDesparasitacion.setMascota(null);
                listaDesparasitacionDesparasitacion = em.merge(listaDesparasitacionDesparasitacion);
            }
            LinkedList<Vacunacion> listaVacunacion = mascota.getListaVacunacion();
            for (Vacunacion listaVacunacionVacunacion : listaVacunacion) {
                listaVacunacionVacunacion.setMascota(null);
                listaVacunacionVacunacion = em.merge(listaVacunacionVacunacion);
            }
            LinkedList<Ingreso> listaIngreso = mascota.getListaIngreso();
            for (Ingreso listaIngresoIngreso : listaIngreso) {
                listaIngresoIngreso.setMascota(null);
                listaIngresoIngreso = em.merge(listaIngresoIngreso);
            }
            LinkedList<Cita> listaCita = mascota.getListaCita();
            for (Cita listaCitaCita : listaCita) {
                listaCitaCita.setMascota(null);
                listaCitaCita = em.merge(listaCitaCita);
            }
            em.remove(mascota);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Mascota> findMascotaEntities() {
        return findMascotaEntities(true, -1, -1);
    }

    public List<Mascota> findMascotaEntities(int maxResults, int firstResult) {
        return findMascotaEntities(false, maxResults, firstResult);
    }

    private List<Mascota> findMascotaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Mascota.class));
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

    public Mascota findMascota(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Mascota.class, id);
        } finally {
            em.close();
        }
    }

    public int getMascotaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Mascota> rt = cq.from(Mascota.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<Mascota> findMascotaEntities(String nombreBuscado) {
        EntityManager em = getEntityManager();
        try {
            String consulta = "SELECT u FROM Mascota u WHERE u.nombre LIKE :nombre";
            TypedQuery<Mascota> query = em.createQuery(consulta, Mascota.class);
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

    public List<Mascota> findMascotaEntities2(String clave) {
        EntityManager em = getEntityManager();
        try {
            String consulta = "SELECT m FROM Mascota m INNER JOIN m.cliente c WHERE c.clave = :clave";
            TypedQuery<Mascota> query = em.createQuery(consulta, Mascota.class);
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
