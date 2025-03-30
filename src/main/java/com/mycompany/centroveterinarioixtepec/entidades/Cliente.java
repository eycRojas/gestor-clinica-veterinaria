package com.mycompany.centroveterinarioixtepec.entidades;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Cliente")
@Table(name = "clientes")
public class Cliente implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private int idCliente;
    private String clave;
    private String nombre;
    private String apePaterno;
    private String apeMaterno;
    private String direccion;
    private String telefono;
    @OneToMany (mappedBy="cliente")
    private LinkedList<Mascota> listaMascotas;

    public Cliente() {

    }

    public Cliente(int idCliente, String clave, String nombre, String apePaterno, String apeMaterno, String direccion, String telefono, LinkedList<Mascota> listaMascotas) {
        this.idCliente = idCliente;
        this.clave = clave;
        this.nombre = nombre;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaMascotas = listaMascotas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LinkedList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(LinkedList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }
    
    
    
}
