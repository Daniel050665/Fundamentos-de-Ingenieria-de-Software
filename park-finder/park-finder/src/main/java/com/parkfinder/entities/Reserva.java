package com.parkfinder.entities;

import com.parkfinder.enums.EstadoReserva;

import java.time.LocalDateTime;

public class Reserva {

    private Long idReserva;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private Integer tiempoEstimadoHoras;
    private EstadoReserva estado;
    private Boolean beneficioAplicado;
    private Usuario usuario;
    private Cupo cupo;
    private Parqueadero parqueadero;

    public Reserva() {
    }

    public Reserva(Long idReserva, LocalDateTime fechaInicio, LocalDateTime fechaFin, Integer tiempoEstimadoHoras, EstadoReserva estado, Boolean beneficioAplicado, Usuario usuario, Cupo cupo, Parqueadero parqueadero) {
        this.idReserva = idReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tiempoEstimadoHoras = tiempoEstimadoHoras;
        this.estado = estado;
        this.beneficioAplicado = beneficioAplicado;
        this.usuario = usuario;
        this.cupo = cupo;
        this.parqueadero = parqueadero;
    }

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getTiempoEstimadoHoras() {
        return tiempoEstimadoHoras;
    }

    public void setTiempoEstimadoHoras(Integer tiempoEstimadoHoras) {
        this.tiempoEstimadoHoras = tiempoEstimadoHoras;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public Boolean getBeneficioAplicado() {
        return beneficioAplicado;
    }

    public void setBeneficioAplicado(Boolean beneficioAplicado) {
        this.beneficioAplicado = beneficioAplicado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cupo getCupo() {
        return cupo;
    }

    public void setCupo(Cupo cupo) {
        this.cupo = cupo;
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }
    
}
