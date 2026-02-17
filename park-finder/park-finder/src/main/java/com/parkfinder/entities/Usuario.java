package com.parkfinder.entities;

import java.time.LocalDate;

public class Usuario {
    private Long idUsuario;
    private String nombre;
    private String correo;
    private String contraseña;
    private String placaVehiculo;
    private TipoVehiculo tipoVehiculo;
    private LocalDate fechaRegistro;
    private Boolean estadoCuenta;
    private Integer usosAcumulados;
}
