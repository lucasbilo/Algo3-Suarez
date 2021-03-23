package edu.fiuba.algo3.modelo.alquiler;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AlquilerPorHoraTest {

    @Test
    public void test01AlquilerPorHoraPor48HorasValePorDosDias() {
        AlquilerPorHora alquilerPorHora = new AlquilerPorHora(48, LocalDate.now(), LocalDate.now(), "201234567890");

        int dias = alquilerPorHora.diasDeAlquiler();

        assertEquals(2, dias);
    }

    @Test
    public void test02AlquilerPorHoraPor48HorasEntregadoAlDiaSiguienteNoFueEntregadoTarde() {
        LocalDate fechaInicio = LocalDate.of(2020, 05, 20);
        LocalDate fechaDevolucion = fechaInicio.plusDays(1);
        AlquilerPorHora alquilerPorHora = new AlquilerPorHora(48, fechaInicio, fechaDevolucion, "201234567890");

        assertFalse(alquilerPorHora.devolucionTardia());
    }

    @Test
    public void test03AlquilerPorHoraPor48HorasEntregadoALosTresDiasFueEntregadoTarde() {
        LocalDate fechaInicio = LocalDate.of(2020, 05, 20);
        LocalDate fechaDevolucion = fechaInicio.plusDays(3);
        AlquilerPorHora alquilerPorHora = new AlquilerPorHora(48, fechaInicio, fechaDevolucion, "201234567890");

        assertTrue(alquilerPorHora.devolucionTardia());
    }
}