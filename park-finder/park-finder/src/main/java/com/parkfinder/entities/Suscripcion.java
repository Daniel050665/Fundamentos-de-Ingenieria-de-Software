package com.parkfinder.entities;

import java.time.LocalDate;

public class Suscripcion {
    private Long idSuscripcion;
    private String tipoPlan;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Boolean estado;
    private Usuario usuario;
}
