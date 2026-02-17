package com.parkfinder.entities;

import java.time.LocalDate;

public class Suscripcion {

    private Long idSuscripcion;
    private String tipoPlan;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Boolean estado;
    private Usuario usuario;

    public Suscripcion() {
    }

    public Suscripcion(Long idSuscripcion, String tipoPlan, LocalDate fechaInicio, LocalDate fechaFin, Boolean estado, Usuario usuario) {
        this.idSuscripcion = idSuscripcion;
        this.tipoPlan = tipoPlan;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.usuario = usuario;
    }

    public Long getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(Long idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
