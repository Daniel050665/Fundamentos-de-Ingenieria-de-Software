package com.parkfinder.entities;

import com.parkfinder.enums.EstadoPago;
import com.parkfinder.enums.TipoPago;

import java.time.LocalDate;

public class Pago {

    private Long idPago;
    private TipoPago tipoPago;
    private double monto;
    private LocalDate fechaPago;
    private EstadoPago estadoPago;
    private String metodoPago;
    private Usuario usuario;
    private Reserva reserva;
}
