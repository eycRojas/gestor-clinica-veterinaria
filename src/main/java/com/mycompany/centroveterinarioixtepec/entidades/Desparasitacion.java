
package com.mycompany.centroveterinarioixtepec.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity(name = "Desparasitacion")
@Table(name = "desparasitaciones")
public class Desparasitacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDesparasitante;
    private String nombreDesparasitante;
    private double dosis;
    private double peso;
    private double temperatura;
    private String fechaDesparasitacion;
    private String fechaProxDesparasitacion;
    @ManyToOne
    private Mascota mascota;
    
    public Desparasitacion(){
        
    }

    public Desparasitacion(int idDesparasitante, String nombreDesparasitante, double dosis, double peso, double temperatura, String fechaDesparasitacion, String fechaProxDesparasitacion, Mascota mascota) {
        this.idDesparasitante = idDesparasitante;
        this.nombreDesparasitante = nombreDesparasitante;
        this.dosis = dosis;
        this.peso = peso;
        this.temperatura = temperatura;
        this.fechaDesparasitacion = fechaDesparasitacion;
        this.fechaProxDesparasitacion = fechaProxDesparasitacion;
        this.mascota = mascota;
    }

    public int getIdDesparasitante() {
        return idDesparasitante;
    }

    public void setIdDesparasitante(int idDesparasitante) {
        this.idDesparasitante = idDesparasitante;
    }

    public String getNombreDesparasitante() {
        return nombreDesparasitante;
    }

    public void setNombreDesparasitante(String nombreDesparasitante) {
        this.nombreDesparasitante = nombreDesparasitante;
    }

    public double getDosis() {
        return dosis;
    }

    public void setDosis(double dosis) {
        this.dosis = dosis;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getFechaDesparasitacion() {
        return fechaDesparasitacion;
    }

    public void setFechaDesparasitacion(String fechaDesparasitacion) {
        this.fechaDesparasitacion = fechaDesparasitacion;
    }

    public String getFechaProxDesparasitacion() {
        return fechaProxDesparasitacion;
    }

    public void setFechaProxDesparasitacion(String fechaProxDesparasitacion) {
        this.fechaProxDesparasitacion = fechaProxDesparasitacion;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }        
    
}
