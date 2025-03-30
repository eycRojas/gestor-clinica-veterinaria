package com.mycompany.centroveterinarioixtepec.entidades;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Mascota")
@Table(name = "Mascotas")
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private int idMascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;
    private String sexo;
    private String senias;
    private String fecha_nacimiento;
    @ManyToOne
    private Cliente cliente;
    
    @OneToMany (mappedBy="mascota")
    private LinkedList<Desparasitacion> listaDesparasitacion;
    @OneToMany (mappedBy="mascota")
    private LinkedList<Vacunacion> listaVacunacion;
    @OneToMany (mappedBy="mascota")
    private LinkedList<Ingreso> listaIngreso;
    @OneToMany (mappedBy="mascota")
    private LinkedList<Cita> listaCita;

    public Mascota() {
    }

    public Mascota(int idMascota, String nombre, String especie, String raza, String color, String sexo, String senias, String fecha_nacimiento, Cliente cliente, LinkedList<Desparasitacion> listaDesparasitacion, LinkedList<Vacunacion> listaVacunacion, LinkedList<Ingreso> listaIngreso, LinkedList<Cita> listaCita) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.senias = senias;
        this.fecha_nacimiento = fecha_nacimiento;
        this.cliente = cliente;
        this.listaDesparasitacion = listaDesparasitacion;
        this.listaVacunacion = listaVacunacion;
        this.listaIngreso = listaIngreso;
        this.listaCita = listaCita;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSenias() {
        return senias;
    }

    public void setSenias(String senias) {
        this.senias = senias;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LinkedList<Desparasitacion> getListaDesparasitacion() {
        return listaDesparasitacion;
    }

    public void setListaDesparasitacion(LinkedList<Desparasitacion> listaDesparasitacion) {
        this.listaDesparasitacion = listaDesparasitacion;
    }

    public LinkedList<Vacunacion> getListaVacunacion() {
        return listaVacunacion;
    }

    public void setListaVacunacion(LinkedList<Vacunacion> listaVacunacion) {
        this.listaVacunacion = listaVacunacion;
    }

    public LinkedList<Ingreso> getListaIngreso() {
        return listaIngreso;
    }

    public void setListaIngreso(LinkedList<Ingreso> listaIngreso) {
        this.listaIngreso = listaIngreso;
    }

    public LinkedList<Cita> getListaCita() {
        return listaCita;
    }

    public void setListaCita(LinkedList<Cita> listaCita) {
        this.listaCita = listaCita;
    }
    
}
