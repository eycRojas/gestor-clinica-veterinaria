package com.mycompany.centroveterinarioixtepec.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity(name = "Cita")
@Table(name = "citas")
public class Cita implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCita;
    private String asunto;
    private String descripcion;
    private String fecha;
    private String hora;
    private String estadoAtendida;
    @ManyToOne
    private Mascota mascota;
    
    public Cita(){
        
    }

    public Cita(int idCita, String asunto, String descripcion, String fecha, String hora, String estadoAtendida, Mascota mascota) {
        this.idCita = idCita;
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.estadoAtendida = estadoAtendida;
        this.mascota = mascota;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstadoAtendida() {
        return estadoAtendida;
    }

    public void setEstadoAtendida(String estadoAtendida) {
        this.estadoAtendida = estadoAtendida;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    
}
