package edu.fiuba.algo3.modelo.alquiler;

import java.time.LocalDate;

public class AlquilerPorHora extends Alquiler {
    public static final int COSTO_HORA = 100;
    private final int horas;

    public AlquilerPorHora(int horas, LocalDate fechaInicio, LocalDate fechaDevolucion, String cliente) {
        super(fechaInicio, fechaDevolucion, cliente);
        this.horas = horas;
    }

    @Override
    public double importe() {
        return this.horas * COSTO_HORA;
    }

    @Override
    protected int diasDeAlquiler() {
        return this.horas / 24;
    }
}
