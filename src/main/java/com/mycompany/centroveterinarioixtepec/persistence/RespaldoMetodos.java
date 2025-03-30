/* Esta clase me sirve para respaldar metodos específicos hechos por mí de los JpaController
 */
package com.mycompany.centroveterinarioixtepec.persistence;

import com.mycompany.centroveterinarioixtepec.entidades.Cita;
import com.mycompany.centroveterinarioixtepec.entidades.Cliente;
import com.mycompany.centroveterinarioixtepec.entidades.Mascota;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class RespaldoMetodos {

    //Este método es de la clase ClienteJpaController y sirve para buscar un cliente con un nombre dado.  
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

    private EntityManager getEntityManager() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    //Este método es de la clase MascotaJpaController y sirve para buscar un cliente con un nombre dado.  
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

    public List<Mascota> findMascotaEntities2(String curp) {
        EntityManager em = getEntityManager();
        try {
            String consulta = "SELECT m FROM Mascota m INNER JOIN m.cliente c WHERE c.curp = :curp";
            TypedQuery<Mascota> query = em.createQuery(consulta, Mascota.class);
            query.setParameter("curp", curp);
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
