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
}
