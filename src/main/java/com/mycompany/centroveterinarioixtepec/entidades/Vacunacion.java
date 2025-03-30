
package com.mycompany.centroveterinarioixtepec.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity(name = "Vacunacion")
@Table(name = "vacunas")
public class Vacunacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVacunacion;
    private String nombreVacuna;
    private double dosis;
    private double peso;
    private double temperatura;
    private String fechaVacunacion;
    private String fechaProxVacunacion;
    @ManyToOne
    private Mascota mascota;
    
    public Vacunacion(){
        
    }

    public Vacunacion(int idVacunacion, String nombreVacuna, double dosis, double peso, double temperatura, String fechaVacunacion, String fechaProxVacunacion, Mascota mascota) {
        this.idVacunacion = idVacunacion;
        this.nombreVacuna = nombreVacuna;
        this.dosis = dosis;
        this.peso = peso;
        this.temperatura = temperatura;
        this.fechaVacunacion = fechaVacunacion;
        this.fechaProxVacunacion = fechaProxVacunacion;
        this.mascota = mascota;
    }

    public int getIdVacunacion() {
        return idVacunacion;
    }

    public void setIdVacunacion(int idVacunacion) {
        this.idVacunacion = idVacunacion;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
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

    public String getFechaVacunacion() {
        return fechaVacunacion;
    }

    public void setFechaVacunacion(String fechaVacunacion) {
        this.fechaVacunacion = fechaVacunacion;
    }

    public String getFechaProxVacunacion() {
        return fechaProxVacunacion;
    }

    public void setFechaProxVacunacion(String fechaProxVacunacion) {
        this.fechaProxVacunacion = fechaProxVacunacion;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

        
    
}
