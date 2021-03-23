package edu.fiuba.algo3.modelo.facturacion;

import edu.fiuba.algo3.modelo.alquiler.AlquilerPorHora;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PenalizacionPorDevolucionTardiaTest {
    @Test
    public void test01PenalizacionPorDevolucionTardiaCalculaElMontoParaAlquilerPorHoraEntregadoATiempo() {
        LocalDate fechaInicio = LocalDate.of(2020, 05, 20);
        LocalDate fechaDevolucion = fechaInicio.plusDays(1);
        AlquilerPorHora alquilerPorHora = new AlquilerPorHora(48, fechaInicio, fechaDevolucion, "201234567890");
        PenalizacionPorDevolucionTardia penalizacion = new PenalizacionPorDevolucionTardia();

        double monto = penalizacion.aplicar(alquilerPorHora);

        assertEquals(0, monto);
    }

    @Test
    public void test02PenalizacionPorDevolucionTardiaCalculaElMontoParaAlquilerPorHoraPor48HorasEntregadoALosTresDias() {
        LocalDate fechaInicio = LocalDate.of(2020, 05, 20);
        LocalDate fechaDevolucion = fechaInicio.plusDays(3);
        AlquilerPorHora alquilerPorHora = new AlquilerPorHora(48, fechaInicio, fechaDevolucion, "201234567890");
        PenalizacionPorDevolucionTardia penalizacion = new PenalizacionPorDevolucionTardia();

        double monto = penalizacion.aplicar(alquilerPorHora);

        assertEquals(alquilerPorHora.importe(), monto);
    }
}