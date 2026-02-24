package com.parkfinder.entities;

import java.time.LocalTime;
import jakarta.persistence.*;

@Entity
@Table(name = "parqueaderos")
public class Parqueadero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Parqueadero() {
    }

    public Parqueadero(Long idParqueadero, String nombre, String direccion, String zona, Double precioPorHora, Double precioSuscripcion, Integer cuposTotales, Integer cuposDisponibles, LocalTime horarioApertura, LocalTime horarioCierre, Boolean estado) {
        this.idParqueadero = idParqueadero;
        this.nombre = nombre;
        this.direccion = direccion;
        this.zona = zona;
        this.precioPorHora = precioPorHora;
        this.precioSuscripcion = precioSuscripcion;
        this.cuposTotales = cuposTotales;
        this.cuposDisponibles = cuposDisponibles;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.estado = estado;
    }

    public Long getIdParqueadero() {
        return idParqueadero;
    }

    public void setIdParqueadero(Long idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(Double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public Double getPrecioSuscripcion() {
        return precioSuscripcion;
    }

    public void setPrecioSuscripcion(Double precioSuscripcion) {
        this.precioSuscripcion = precioSuscripcion;
    }

    public Integer getCuposTotales() {
        return cuposTotales;
    }

    public void setCuposTotales(Integer cuposTotales) {
        this.cuposTotales = cuposTotales;
    }

    public Integer getCuposDisponibles() {
        return cuposDisponibles;
    }

    public void setCuposDisponibles(Integer cuposDisponibles) {
        this.cuposDisponibles = cuposDisponibles;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
}
