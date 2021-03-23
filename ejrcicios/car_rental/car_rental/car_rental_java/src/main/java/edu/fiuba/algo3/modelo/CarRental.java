package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.alquiler.Alquiler;
import edu.fiuba.algo3.modelo.facturacion.ReglaDeFacturacion;

import java.util.List;

public class CarRental {
    private final List<ReglaDeFacturacion> reglasDeFacturacion;

    public CarRental(List<ReglaDeFacturacion> reglas) {
        this.reglasDeFacturacion = reglas;
    }

    public double importePara(Alquiler alquiler) {
        double importe = alquiler.importe();

        double adicional = 0;
        for (ReglaDeFacturacion regla : reglasDeFacturacion) {
            adicional += regla.aplicar(alquiler);
        }

        return importe + adicional;
    }
}
