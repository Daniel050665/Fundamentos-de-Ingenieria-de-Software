package com.parkfinder.entities;

import java.time.LocalDate;

public class Beneficio {
    private Long idBeneficio;
    private int usosAcumulados;
    private Boolean beneficioDisponible;
    private LocalDate fechaGeneracion;
    private LocalDate fechaUso;
    private Usuario usuario;

}
