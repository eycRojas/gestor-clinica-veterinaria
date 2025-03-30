package com.mycompany.centroveterinarioixtepec.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUsuario;
    private String usuario;
    private String nombre;
    private String contrasenia;

    public Usuario() {

    }

    public Usuario(int idUsuario, String usuario, String nombre, String constrasenia) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.nombre = nombre;
        this.contrasenia = constrasenia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConstrasenia() {
        return contrasenia;
    }

    public void setConstrasenia(String constrasenia) {
        this.contrasenia = constrasenia;
    }
    
    

}
