package edu.fiuba.algo3.modelo.alquiler;

import java.time.LocalDate;

public class AlquilerPorDia extends Alquiler {
    public static final int COSTO_DIA = 2000;

    private final int dias;

    public AlquilerPorDia(int dias, LocalDate fechaInicio, LocalDate fechaDevolucion, String cliente) {
        super(fechaInicio, fechaDevolucion, cliente);
        this.dias = dias;
    }

    @Override
    public double importe() {
        return this.dias * COSTO_DIA;
    }

    @Override
    protected int diasDeAlquiler() {
        return this.dias;
    }
}
