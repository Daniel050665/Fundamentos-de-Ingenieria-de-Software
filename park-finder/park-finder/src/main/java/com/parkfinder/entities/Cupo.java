package com.parkfinder.entities;

import jakarta.persistence.*;
import com.parkfinder.enums.EstadoCupo;

@Entity
@Table(name = "cupos")
public class Cupo {

    @Id
    private Long idCupo;

    private Integer numeroCupo;

    @Enumerated(EnumType.STRING)
    private EstadoCupo estado;

    @ManyToOne
    @JoinColumn(name = "id_tipo_vehiculo")
    private TipoVehiculo tipoVehiculoPermitido;

    @ManyToOne
    @JoinColumn(name = "id_parqueadero")
    private Parqueadero parqueadero;

    public Cupo() {
    }

    public Cupo(Long idCupo, Integer numeroCupo, EstadoCupo estado, TipoVehiculo tipoVehiculoPermitido, Parqueadero parqueadero) {
        this.idCupo = idCupo;
        this.numeroCupo = numeroCupo;
        this.estado = estado;
        this.tipoVehiculoPermitido = tipoVehiculoPermitido;
        this.parqueadero = parqueadero;
    }
    
    public Long getIdCupo() {
        return idCupo;
    }

    public void setIdCupo(Long idCupo) {
        this.idCupo = idCupo;
    }

    public Integer getNumeroCupo() {
        return numeroCupo;
    }

    public void setNumeroCupo(Integer numeroCupo) {
        this.numeroCupo = numeroCupo;
    }

    public EstadoCupo getEstado() {
        return estado;
    }

    public void setEstado(EstadoCupo estado) {
        this.estado = estado;
    }

    public TipoVehiculo getTipoVehiculoPermitido() {
        return tipoVehiculoPermitido;
    }

    public void setTipoVehiculoPermitido(TipoVehiculo tipoVehiculoPermitido) {
        this.tipoVehiculoPermitido = tipoVehiculoPermitido;
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }
}
