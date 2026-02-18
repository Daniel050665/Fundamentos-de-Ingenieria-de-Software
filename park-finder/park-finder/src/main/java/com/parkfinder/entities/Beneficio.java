package com.parkfinder.entities;

import java.time.LocalDate;

public class Beneficio {
    
    private Long idBeneficio;
    private int usosAcumulados;
    private Boolean beneficioDisponible;
    private LocalDate fechaGeneracion;
    private LocalDate fechaUso;
    private Usuario usuario;

    public Beneficio() {
    }

    public Beneficio(Long idBeneficio, int usosAcumulados, Boolean beneficioDisponible, LocalDate fechaGeneracion, LocalDate fechaUso, Usuario usuario) {
        this.idBeneficio = idBeneficio;
        this.usosAcumulados = usosAcumulados;
        this.beneficioDisponible = beneficioDisponible;
        this.fechaGeneracion = fechaGeneracion;
        this.fechaUso = fechaUso;
        this.usuario = usuario;
    }

    public Long getIdBeneficio() {
        return idBeneficio;
    }

    public void setIdBeneficio(Long idBeneficio) {
        this.idBeneficio = idBeneficio;
    }

    public int getUsosAcumulados() {
        return usosAcumulados;
    }

    public void setUsosAcumulados(int usosAcumulados) {
        this.usosAcumulados = usosAcumulados;
    }

    public Boolean getBeneficioDisponible() {
        return beneficioDisponible;
    }

    public void setBeneficioDisponible(Boolean beneficioDisponible) {
        this.beneficioDisponible = beneficioDisponible;
    }

    public LocalDate getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDate fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public LocalDate getFechaUso() {
        return fechaUso;
    }

    public void setFechaUso(LocalDate fechaUso) {
        this.fechaUso = fechaUso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
