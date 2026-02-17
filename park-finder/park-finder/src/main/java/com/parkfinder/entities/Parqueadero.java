package com.parkfinder.entities;

import java.time.LocalTime;

public class Parqueadero {
    private Long idParqueadero;
    private String nombre;
    private String direccion;
    private String zona;
    private Double precioPorHora;
    private Double precioSuscripcion;
    private Integer cuposTotales;
    private Integer cuposDisponibles;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Boolean estado;
}
