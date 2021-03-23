package edu.fiuba.algo3.modelo.alquiler;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class Alquiler {
    public static final String PREFIJO_EMPRESA = "26";
    private final LocalDate fechaInicio;
    private final LocalDate fechaDevolucion;
    private final String cliente;

    public Alquiler(LocalDate fechaInicio, LocalDate fechaDevolucion, String cliente) {
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
        this.cliente = cliente;
    }

    public boolean devolucionTardia() {
        LocalDate fechaLimite = this.fechaInicio.plusDays(this.diasDeAlquiler());
        return this.fechaDevolucion.isAfter(fechaLimite);
    }

    public boolean alquilerEmpresarial() {
        return this.cliente.startsWith(PREFIJO_EMPRESA);
    }

    public boolean alquiladoMiercoles() {
        return this.fechaInicio.getDayOfWeek() == DayOfWeek.WEDNESDAY;
    }

    public abstract double importe();
    protected abstract int diasDeAlquiler();
}
