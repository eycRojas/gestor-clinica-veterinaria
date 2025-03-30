package com.mycompany.centroveterinarioixtepec.persistence;

import com.mycompany.centroveterinarioixtepec.entidades.Cita;
import com.mycompany.centroveterinarioixtepec.entidades.Cliente;
import com.mycompany.centroveterinarioixtepec.entidades.Desparasitacion;
import com.mycompany.centroveterinarioixtepec.entidades.Ingreso;
import com.mycompany.centroveterinarioixtepec.entidades.Mascota;
import com.mycompany.centroveterinarioixtepec.entidades.Vacunacion;
import com.mycompany.centroveterinarioixtepec.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerPersistence {

    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    ClienteJpaController clienteJpa = new ClienteJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();
    DesparasitacionJpaController desparasitacionJpa = new DesparasitacionJpaController();
    VacunacionJpaController vacunacionJpa = new VacunacionJpaController();
    IngresoJpaController ingresoJpa = new IngresoJpaController();
    CitaJpaController citaJpa = new CitaJpaController();

    //Metodos para la entidad Usuario
    public boolean validarUsuario(String usuario, String contrasenia) {

        if (usuarioJpa.findUsuario(usuario, contrasenia) != null) {
            return true;
        } else {
            return false;
        }
    }

    //Metodos para la entidad Cliente
    public boolean nuevoCliente(Cliente cliente) throws Exception {

        clienteJpa.create(cliente);
        return true;

    }

    public List<Cliente> traerClientes() {

        return clienteJpa.findClienteEntities();
    }

    public List<Cliente> traerClientes(String nombreBuscado) {

        return clienteJpa.findClienteEntities(nombreBuscado);
    }

    public List<Cliente> traerClienteClave(String clave) {

        return clienteJpa.findClienteClave(clave);
    }

    public void eliminarCliente(int idCliente) {

        try {
            clienteJpa.destroy(idCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean modificarCliente(Cliente cliente) {

        try {
            clienteJpa.edit(cliente);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public String traerUltimaClave(String prefijo) {
        try {
            return clienteJpa.traerUltimaClave(prefijo);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //Metodos para la entidad Mascota
    public boolean nuevaMascota(Mascota mascota) {

        mascotaJpa.create(mascota);
        return true;

    }

    public List<Mascota> traerMascotas() {

        return mascotaJpa.findMascotaEntities();
    }

    public List<Mascota> traerMascotas(String nombreBuscado) {

        return mascotaJpa.findMascotaEntities(nombreBuscado);
    }

    public List<Mascota> traerMascotas2(String clave) {

        return mascotaJpa.findMascotaEntities2(clave);

    }

    public void eliminarMascota(int idMascota) {

        try {
            mascotaJpa.destroy(idMascota);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int idMascota) {

        return mascotaJpa.findMascota(idMascota);
    }

    public boolean modificarMascota(Mascota mascota) {

        try {
            mascotaJpa.edit(mascota);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //Metodos para la entidad Desparasitacion
    public boolean nuevoDesparasitante(Desparasitacion desparasitacion) {

        desparasitacionJpa.create(desparasitacion);
        return true;

    }

    public List<Desparasitacion> traerDespartasitaciones() {

        return desparasitacionJpa.findDesparasitacionEntities();
    }

    public List<Desparasitacion> traerDespartasitaciones(String nombreBuscado) {

        return desparasitacionJpa.findDesparasitacionEntities(nombreBuscado);
    }

    public List<Desparasitacion> traerDespartasitaciones2(String clave) {

        return desparasitacionJpa.findDesparasitacionEntities2(clave);
    }

    public Desparasitacion traerDesparasitacion(int idRegistro) {

        return desparasitacionJpa.findDesparasitacion(idRegistro);
    }

    public void eliminarDesparasitante(int idRegistro) {

        try {
            desparasitacionJpa.destroy(idRegistro);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean modificarDesparasitacion(Desparasitacion desparasitacion) {

        try {
            desparasitacionJpa.edit(desparasitacion);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //Metodos para la entidad Vacunacion
    public boolean nuevaVacunacion(Vacunacion vacunacion) {

        vacunacionJpa.create(vacunacion);
        return true;

    }

    public List<Vacunacion> traerVacunaciones() {

        return vacunacionJpa.findVacunacionEntities();
    }

    public List<Vacunacion> traerVacunaciones(String nombreBuscado) {

        return vacunacionJpa.findVacunacionEntities(nombreBuscado);
    }

    public List<Vacunacion> traerVacunaciones2(String clave) {

        return vacunacionJpa.findVacunacionEntities2(clave);
    }

    public Vacunacion traerVacunacion(int idRegistro) {

        return vacunacionJpa.findVacunacion(idRegistro);
    }

    public void eliminarVacunacion(int idRegistro) {

        try {
            vacunacionJpa.destroy(idRegistro);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean modificarVacunacion(Vacunacion vacunacion) {

        try {
            vacunacionJpa.edit(vacunacion);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //Metodos para la entidad Ingreso
    public boolean nuevoIngreso(Ingreso ingreso) {

        ingresoJpa.create(ingreso);
        return true;

    }

    public List<Ingreso> traerIngreso() {

        return ingresoJpa.findIngresoEntities();
    }

    public List<Ingreso> traerIngresos(String nombreBuscado) {

        return ingresoJpa.findIngresoEntities(nombreBuscado);
    }

    public List<Ingreso> traerIngresos2(String clave) {

        return ingresoJpa.findIngresoEntities2(clave);
    }

    public Ingreso traerIngreso(int idRegistro) {

        return ingresoJpa.findIngreso(idRegistro);
    }

    public void eliminarIngreso(int idRegistro) {

        try {
            ingresoJpa.destroy(idRegistro);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean modificarIngreso(Ingreso ingreso) {

        try {
            ingresoJpa.edit(ingreso);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //Métodos para la entidad cita
    public boolean nuevaCita(Cita cita) {
        citaJpa.create(cita);

        return true;
    }

    public boolean validarFecha(String fechaAValidar) {

        if (citaJpa.traerCitas(fechaAValidar).isEmpty()) {
            return false;
        } else {
            return true;
        }

    }

    public List<Cita> traerCitas(String fechaSeleccionada) {

        return citaJpa.traerCitas(fechaSeleccionada);
    }

    public void modificarCita(Cita cita) {
        try {
            citaJpa.edit(cita);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarCita(int idCita) {

        try {
            citaJpa.destroy(idCita);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
