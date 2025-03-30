package com.mycompany.centroveterinarioixtepec.entidades;

import com.mycompany.centroveterinarioixtepec.persistence.ControllerPersistence;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class Controller {

    ControllerPersistence controlPersis = new ControllerPersistence();

    //Metodos para la entidad Usuario
    public boolean validarUsuario(String usuario, String contrasenia) {

        return controlPersis.validarUsuario(usuario, contrasenia);
    }

    //Metodos para la entidad Clientes
    public boolean nuevoCliente(String clave, String nombreCliente, String apePaterno, String apeMaterno,
            String direccion, String telefono, LinkedList listaMascotas) throws Exception {

        Cliente cliente = new Cliente();
        cliente.setClave(clave);
        cliente.setNombre(nombreCliente);
        cliente.setApePaterno(apePaterno);
        cliente.setApeMaterno(apeMaterno);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        cliente.setListaMascotas(listaMascotas);

        return controlPersis.nuevoCliente(cliente);

    }

    public List<Cliente> traerClientes() {

        return controlPersis.traerClientes();
    }

    public List<Cliente> traerClientes(String nombreBuscado) {

        return controlPersis.traerClientes(nombreBuscado);
    }

    public List<Cliente> traerClientesClave(String clave) {

        return controlPersis.traerClienteClave(clave);
    }

    public boolean eliminarCliente(String clave) {

        List<Cliente> clientes = controlPersis.traerClienteClave(clave);

        Cliente cliente = clientes.get(0);

        LinkedList<Mascota> listaMascotas = cliente.getListaMascotas();

        if (listaMascotas == null || listaMascotas.isEmpty()) {
            controlPersis.eliminarCliente(cliente.getIdCliente());
            return true;
        } else {
            return false;
        }

    }

    public Cliente traerCliente(String clave) {

        List<Cliente> clientes = controlPersis.traerClienteClave(clave);        

        if (clientes != null && !clientes.isEmpty()) {
            Cliente cliente = clientes.get(0);
            return cliente;
        } else {
            return null;
        }

    }

    public boolean modificarCliente(Cliente cliente, String nombre, String apePaterno,
            String apeMaterno, String direccion, String telefono) {

        cliente.setNombre(nombre);
        cliente.setApePaterno(apePaterno);
        cliente.setApeMaterno(apeMaterno);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);

        return controlPersis.modificarCliente(cliente);
    }

    public String traerUltimaClave(String prefijo) {

        return controlPersis.traerUltimaClave(prefijo);
    }

    //Metodos para la entidad Mascotas
    public boolean nuevaMascota(Cliente cliente, String nombreMascota, String especie, String raza,
            String color, String sexo, String fecha_nac, String señas, LinkedList listaDesparasitaciones) {

        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMascota);
        mascota.setEspecie(especie);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setSexo(sexo);
        mascota.setFecha_nacimiento(fecha_nac);
        mascota.setSenias(señas);
        mascota.setCliente(cliente);
        mascota.setListaDesparasitacion(listaDesparasitaciones);

        boolean verificacion = controlPersis.nuevaMascota(mascota);

        LinkedList<Mascota> listaMascotas = new LinkedList<Mascota>();

        listaMascotas = cliente.getListaMascotas();

        listaMascotas.add(mascota);

        cliente.setListaMascotas(listaMascotas);
        controlPersis.modificarCliente(cliente);

        return verificacion;

    }

    public List<Mascota> traerMascotas() {

        return controlPersis.traerMascotas();
    }

    public List<Mascota> traerMascotas(String nombreBuscado) {

        return controlPersis.traerMascotas(nombreBuscado);
    }

    public List<Mascota> traerMascotas2(String clave) {

        return controlPersis.traerMascotas2(clave);
    }

    public void eliminarMascota(int idMascota) {

        controlPersis.eliminarMascota(idMascota);
    }

    public Mascota traerMascota(int idMascota) {

        return controlPersis.traerMascota(idMascota);

    }

    public boolean modificarMascota(Mascota mascota, String dueñoMascota, String nombreMascota, String especie, String raza,
            String color, String sexo, String señas) {

        mascota.setNombre(nombreMascota);
        mascota.setEspecie(especie);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setSexo(sexo);
        mascota.setSenias(señas);

        return controlPersis.modificarMascota(mascota);
    }

    //Metodos para la entidad Desparasitante
    public boolean nuevoDesparasitante(Mascota mascota, String desparasitante, String dosis, String peso,
            String temperatura, String fechaDesparasitacion, String fechaProxDesparasitacion) {

        Desparasitacion desparasitacion = new Desparasitacion();
        desparasitacion.setNombreDesparasitante(desparasitante);
        desparasitacion.setDosis(Double.parseDouble(dosis));
        desparasitacion.setPeso(Double.parseDouble(peso));
        desparasitacion.setTemperatura(Double.parseDouble(temperatura));
        desparasitacion.setFechaDesparasitacion(fechaDesparasitacion);

        if (!fechaProxDesparasitacion.equals("")) {
            desparasitacion.setFechaProxDesparasitacion(fechaProxDesparasitacion);

            nuevaCita("Desparasitación", "Proxima dosis de desparasitante", fechaProxDesparasitacion,
                    "8:00", "N", mascota);

            JOptionPane.showMessageDialog(null, "Cita generada automaticamente para: " + fechaProxDesparasitacion);
        }

        boolean verificacion = controlPersis.nuevoDesparasitante(desparasitacion);

        LinkedList<Desparasitacion> listaDesparasitante = new LinkedList<Desparasitacion>();

        listaDesparasitante = mascota.getListaDesparasitacion();

        listaDesparasitante.add(desparasitacion);

        mascota.setListaDesparasitacion(listaDesparasitante);
        controlPersis.modificarMascota(mascota);

        return verificacion;

    }

    public List<Desparasitacion> traerDespartasitaciones() {

        return controlPersis.traerDespartasitaciones();
    }

    public List<Desparasitacion> traerDespartasitaciones(String nombreBuscado) {

        return controlPersis.traerDespartasitaciones(nombreBuscado);
    }

    public List<Desparasitacion> traerDespartasitaciones2(String clave) {

        return controlPersis.traerDespartasitaciones2(clave);
    }

    public void eliminarDesparasitante(int idRegistro) {

        controlPersis.eliminarDesparasitante(idRegistro);
    }

    public Desparasitacion traerDesparasitacion(int idRegistro) {

        return controlPersis.traerDesparasitacion(idRegistro);

    }

    public boolean modificarDesparasitacion(Desparasitacion desparasitacion, String desparasitante, String dosis, String peso, String temperatura) {

        desparasitacion.setNombreDesparasitante(desparasitante);
        desparasitacion.setDosis(Double.valueOf(dosis));
        desparasitacion.setPeso(Double.valueOf(peso));
        desparasitacion.setTemperatura(Double.valueOf(temperatura));

        return controlPersis.modificarDesparasitacion(desparasitacion);
    }

    //Metodos para la entidad Vacunacion
    public boolean nuevaVacuna(Mascota mascota, String vacuna, String dosis, String peso,
            String temperatura, String fechaVacunacion, String fechaProxVacunacion) {

        Vacunacion vacunacion = new Vacunacion();

        vacunacion.setNombreVacuna(vacuna);
        vacunacion.setDosis(Double.parseDouble(dosis));
        vacunacion.setPeso(Double.parseDouble(peso));
        vacunacion.setTemperatura(Double.parseDouble(temperatura));
        vacunacion.setFechaVacunacion(fechaVacunacion);

        if (!fechaProxVacunacion.equals("")) {
            vacunacion.setFechaProxVacunacion(fechaProxVacunacion);

            nuevaCita("Vacunación", "Proxima dosis de vacuna", fechaProxVacunacion,
                    "8:00", "N", mascota);

            JOptionPane.showMessageDialog(null, "Cita generada automaticamente para: " + fechaProxVacunacion);
        }

        boolean verificacion = controlPersis.nuevaVacunacion(vacunacion);

        LinkedList<Vacunacion> listaVacunacion = new LinkedList<Vacunacion>();

        listaVacunacion = mascota.getListaVacunacion();

        listaVacunacion.add(vacunacion);

        mascota.setListaVacunacion(listaVacunacion);
        controlPersis.modificarMascota(mascota);

        return verificacion;

    }

    public List<Vacunacion> traerVacunaciones() {

        return controlPersis.traerVacunaciones();
    }

    public List<Vacunacion> traerVacunaciones(String nombreBuscado) {

        return controlPersis.traerVacunaciones(nombreBuscado);
    }

    public List<Vacunacion> traerVacunaciones2(String clave) {

        return controlPersis.traerVacunaciones2(clave);
    }

    public void eliminarVacunacion(int idRegistro) {

        controlPersis.eliminarVacunacion(idRegistro);
    }

    public Vacunacion traerVacunacion(int idRegistro) {

        return controlPersis.traerVacunacion(idRegistro);

    }

    public boolean modificarVacunacion(Vacunacion vacunacion, String desparasitante, String dosis, String peso, String temperatura) {

        vacunacion.setNombreVacuna(desparasitante);
        vacunacion.setDosis(Double.valueOf(dosis));
        vacunacion.setPeso(Double.valueOf(peso));
        vacunacion.setTemperatura(Double.valueOf(temperatura));

        return controlPersis.modificarVacunacion(vacunacion);
    }

    //Metodos para la entidad Ingreso
    public boolean nuevoIngreso(Mascota mascota, String cirugia, String costo, String fechaIngreso,
            String horaIngreso, String alta, String pagado) {

        Ingreso ingreso = new Ingreso();

        ingreso.setCirugia(cirugia);
        ingreso.setCosto(costo);
        ingreso.setFechaIngreso(fechaIngreso);
        ingreso.setHoraIngreso(horaIngreso);
        ingreso.setEstadoAlta(alta);
        ingreso.setEstadoPagado(pagado);

        boolean verificacion = controlPersis.nuevoIngreso(ingreso);

        LinkedList<Ingreso> listaIngresos = new LinkedList<Ingreso>();

        listaIngresos = mascota.getListaIngreso();

        listaIngresos.add(ingreso);

        mascota.setListaIngreso(listaIngresos);
        controlPersis.modificarMascota(mascota);

        return verificacion;

    }

    public List<Ingreso> traerIngreso() {

        return controlPersis.traerIngreso();
    }

    public List<Ingreso> traerIngresos(String nombreBuscado) {

        return controlPersis.traerIngresos(nombreBuscado);
    }

    public List<Ingreso> traerIngresos2(String clave) {

        return controlPersis.traerIngresos2(clave);
    }

    public Ingreso traerIngreso(int idRegistro) {

        return controlPersis.traerIngreso(idRegistro);

    }

    public void eliminarIngreso(int idRegistro) {

        controlPersis.eliminarIngreso(idRegistro);
    }

    public boolean modificarIngreso(Ingreso ingreso, String cirugia, String costo, String estadoPago) {

        ingreso.setCirugia(cirugia);
        ingreso.setCosto(costo);
        ingreso.setEstadoPagado(estadoPago);

        return controlPersis.modificarIngreso(ingreso);
    }

    public boolean darAlta(int idRegistro) {

        Date fecha = new Date();

        int mes = fecha.getMonth();
        int mesActual = mes + 1;
        String fechaEgreso = fecha.getYear() + 1900 + "-" + mesActual + "-" + fecha.getDate();
        String horaEgreso = fecha.getHours() + ":" + fecha.getMinutes() + ":" + fecha.getSeconds();

        String alta = "S";
        String pagado = "S";

        Ingreso ingreso = traerIngreso(idRegistro);

        ingreso.setFechaEgreso(fechaEgreso);
        ingreso.setHoraEgreso(horaEgreso);
        ingreso.setEstadoAlta(alta);
        ingreso.setEstadoPagado(pagado);

        return controlPersis.modificarIngreso(ingreso);

    }

    //Métodos para la entidad cita
    public boolean nuevaCita(String asunto, String descripcion, String fecha, String hora,
            String estadoAtendida, Mascota mascota) {

        Cita cita = new Cita();

        cita.setAsunto(asunto);
        cita.setDescripcion(descripcion);
        cita.setFecha(fecha);
        cita.setHora(hora);
        cita.setEstadoAtendida(estadoAtendida);

        boolean verificacion = controlPersis.nuevaCita(cita);

        LinkedList<Cita> listaCitas = new LinkedList<Cita>();

        listaCitas = mascota.getListaCita();

        listaCitas.add(cita);

        mascota.setListaCita(listaCitas);
        controlPersis.modificarMascota(mascota);

        return verificacion;

    }

    public boolean validarFecha(String fechaAValidar) {

        return controlPersis.validarFecha(fechaAValidar);

    }

    public List<Cita> traerCitas(String fechaSeleccionada) {

        return controlPersis.traerCitas(fechaSeleccionada);
    }

    public void modificarCita(Cita cita) {

        controlPersis.modificarCita(cita);

    }

    public void eliminarCita(int idCita) {

        controlPersis.eliminarCita(idCita);
    }

}
