package edu.fiuba.algo3.modelo.facturacion;

import edu.fiuba.algo3.modelo.alquiler.Alquiler;

public class DescuentoPorMiercoles implements ReglaDeFacturacion {

    public static final int DESCUENTO = 50;

    @Override
    public double aplicar(Alquiler alquiler) {
        if (alquiler.alquiladoMiercoles()) {
            return (-1) * DESCUENTO;
        }
        return 0;
    }
}
