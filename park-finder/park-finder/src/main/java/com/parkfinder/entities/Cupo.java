package com.parkfinder.entities;

import com.parkfinder.enums.EstadoCupo;

public class Cupo {
    private Long idCupo;
    private Integer numeroCupo;
    private EstadoCupo estado;
    private TipoVehiculo tipoVehiculoPermitido;
    private Parqueadero parqueadero;
}
