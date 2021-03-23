package edu.fiuba.algo3.modelo.alquiler;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AlquilerPorKilometroTest {
    @Test
    public void test01AlquilerPorKilometroConFechaInicioMiercolesDevuelveVerdaderoAlConsultarSiFueAlquiladoUnMiercoles() {
        LocalDate fecha = LocalDate.of(2020, 05, 20);
        AlquilerPorKilometro alquilerPorKilometro = new AlquilerPorKilometro(200, fecha, fecha, "261234567890");

        assertTrue(alquilerPorKilometro.alquiladoMiercoles());
    }
}