package edu.fiuba.algo3.modelo.alquiler;

import java.time.LocalDate;

public class AlquilerPorKilometro extends Alquiler {
    public static final int COSTO_BASE = 100;
    public static final int COSTO_KM = 10;

    private final int kilometros;

    public AlquilerPorKilometro(int kilometros, LocalDate fechaInicio, LocalDate fechaDevolucion, String cliente) {
        super(fechaInicio, fechaDevolucion, cliente);
        this.kilometros = kilometros;
    }

    @Override
    public double importe() {
        return COSTO_BASE + this.kilometros * COSTO_KM;
    }

    @Override
    protected int diasDeAlquiler() {
        return 0;
    }
}
