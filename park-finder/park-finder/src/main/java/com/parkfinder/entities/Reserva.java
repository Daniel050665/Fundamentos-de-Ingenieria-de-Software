package com.parkfinder.entities;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import com.parkfinder.enums.EstadoReserva;

@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    private Long idReserva;

    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private Integer tiempoEstimadoHoras;

    @Enumerated(EnumType.STRING)
    private EstadoReserva estado;

    private Boolean beneficioAplicado;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_cupo")
    private Cupo cupo;

    @ManyToOne
    @JoinColumn(name = "id_parqueadero")
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
    
}
