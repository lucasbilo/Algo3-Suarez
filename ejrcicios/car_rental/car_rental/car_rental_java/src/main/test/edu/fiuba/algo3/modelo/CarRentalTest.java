package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.alquiler.AlquilerPorDia;
import edu.fiuba.algo3.modelo.alquiler.AlquilerPorHora;
import edu.fiuba.algo3.modelo.facturacion.DescuentoPorEmpresa;
import edu.fiuba.algo3.modelo.facturacion.DescuentoPorMiercoles;
import edu.fiuba.algo3.modelo.facturacion.PenalizacionPorDevolucionTardia;
import edu.fiuba.algo3.modelo.facturacion.ReglaDeFacturacion;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarRentalTest {
    @Test
    public void test01CarRentalSinDescuentosNiPenalizacionesCalculaElImporteParaUnAlquilerDeTresHoras() {
        CarRental carRental = new CarRental(List.of());

        AlquilerPorDia alquiler = new AlquilerPorDia(3, LocalDate.now(), LocalDate.now(), "201234567890");

        double monto = carRental.importePara(alquiler);

        assertEquals(6000, monto);
    }

    @Test
    public void test02CarRentalConDescuentoPorEmpresaCalculaElImporteParaUnAlquilerDeDosDias() {
        DescuentoPorEmpresa descuentoPorEmpresa = new DescuentoPorEmpresa();
        AlquilerPorDia alquilerPorDia = new AlquilerPorDia(2, LocalDate.now(), LocalDate.now(), "261234567890");
        CarRental carRental = new CarRental(List.of(descuentoPorEmpresa));

        double monto = carRental.importePara(alquilerPorDia);

        assertEquals(3800, monto);
    }

    @Test
    public void test03CarRentalConDescuentoPorMiercolesYPenalizacionPorDevolucionTardiaCalculaElImporteParaUnAlquilerPorHoraDevueltoTarde() {
        DescuentoPorMiercoles descuentoPorMiercoles = new DescuentoPorMiercoles();
        PenalizacionPorDevolucionTardia penalizacionPorDevolucionTardia = new PenalizacionPorDevolucionTardia();
        List<ReglaDeFacturacion> reglas = List.of(descuentoPorMiercoles, penalizacionPorDevolucionTardia);
        CarRental carRental = new CarRental(reglas);
        LocalDate fechaInicio = LocalDate.of(2020, 05, 20);
        LocalDate fechaDevolucion = fechaInicio.plusDays(2);
        AlquilerPorHora alquilerPorHora = new AlquilerPorHora(24, fechaInicio, fechaDevolucion, "261234567890");

        double monto = carRental.importePara(alquilerPorHora);

        assertEquals(4750, monto);
    }
}