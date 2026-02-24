package com.parkfinder.entities;

import java.time.LocalDate;
import jakarta.persistence.*;
import com.parkfinder.enums.EstadoPago;
import com.parkfinder.enums.TipoPago;

@Entity
@Table(name = "pagos")
public class Pago {

    @Id
    private Long idPago;

    @Enumerated(EnumType.STRING)
    private TipoPago tipoPago;

    private double monto;
    private LocalDate fechaPago;

    @Enumerated(EnumType.STRING)
    private EstadoPago estadoPago;

    private String metodoPago;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_reserva")
    private Reserva reserva;

    public Pago() {
    }

    public Pago(Long idPago, TipoPago tipoPago, double monto, LocalDate fechaPago, EstadoPago estadoPago, String metodoPago, Usuario usuario, Reserva reserva) {
        this.idPago = idPago;
        this.tipoPago = tipoPago;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.estadoPago = estadoPago;
        this.metodoPago = metodoPago;
        this.usuario = usuario;
        this.reserva = reserva;
    }

    public Long getIdPago() {
        return idPago;
    }

    public void setIdPago(Long idPago) {
        this.idPago = idPago;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public EstadoPago getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(EstadoPago estadoPago) {
        this.estadoPago = estadoPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

}
