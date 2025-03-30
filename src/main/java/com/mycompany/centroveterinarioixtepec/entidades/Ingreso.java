package com.mycompany.centroveterinarioixtepec.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Ingreso")
@Table(name = "ingresos")
public class Ingreso implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIngreso;
    private String cirugia;
    private String fechaIngreso;
    private String horaIngreso;
    private String fechaEgreso;
    private String horaEgreso;
    private String estadoAlta;
    private String costo;
    private String estadoPagado;
    @ManyToOne
    private Mascota mascota;
    
    public Ingreso(){
        
    }

    public Ingreso(int idIngreso, String cirugia, String fechaIngreso, String horaIngreso, String fechaEgreso, String horaEgreso, String estadoAlta, String costo, String estadoPagado, Mascota mascota) {
        this.idIngreso = idIngreso;
        this.cirugia = cirugia;
        this.fechaIngreso = fechaIngreso;
        this.horaIngreso = horaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.horaEgreso = horaEgreso;
        this.estadoAlta = estadoAlta;
        this.costo = costo;
        this.estadoPagado = estadoPagado;
        this.mascota = mascota;
    }

    public int getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

    public String getCirugia() {
        return cirugia;
    }

    public void setCirugia(String cirugia) {
        this.cirugia = cirugia;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(String fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public String getHoraEgreso() {
        return horaEgreso;
    }

    public void setHoraEgreso(String horaEgreso) {
        this.horaEgreso = horaEgreso;
    }

    public String getEstadoAlta() {
        return estadoAlta;
    }

    public void setEstadoAlta(String estadoAlta) {
        this.estadoAlta = estadoAlta;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getEstadoPagado() {
        return estadoPagado;
    }

    public void setEstadoPagado(String estadoPagado) {
        this.estadoPagado = estadoPagado;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
}
