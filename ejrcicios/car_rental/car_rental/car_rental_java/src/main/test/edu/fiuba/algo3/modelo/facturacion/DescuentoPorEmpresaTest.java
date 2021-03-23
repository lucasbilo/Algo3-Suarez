package edu.fiuba.algo3.modelo.facturacion;

import edu.fiuba.algo3.modelo.alquiler.AlquilerPorKilometro;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DescuentoPorEmpresaTest {
    @Test
    public void test01DescuentoPorEmpresaCalculaDescuentoParaUnAlquilerNoEmpresarial() {
        LocalDate fecha = LocalDate.of(2020, 05, 04);
        AlquilerPorKilometro alquilerPorKilometro = new AlquilerPorKilometro(500, fecha, fecha, "201234567890");
        DescuentoPorEmpresa descuentoPorEmpresa = new DescuentoPorEmpresa();

        double monto = descuentoPorEmpresa.aplicar(alquilerPorKilometro);

        assertEquals(0, monto);
    }

    @Test
    public void test02DescuentoPorEmpresaCalculaDescuentoParaUnAlquilerEmpresarial() {
        LocalDate fecha = LocalDate.of(2020, 05, 04);
        AlquilerPorKilometro alquilerPorKilometro = new AlquilerPorKilometro(500, fecha, fecha, "261234567890");
        DescuentoPorEmpresa descuentoPorEmpresa = new DescuentoPorEmpresa();

        double monto = descuentoPorEmpresa.aplicar(alquilerPorKilometro);

        assertEquals(-255, monto);
    }
}