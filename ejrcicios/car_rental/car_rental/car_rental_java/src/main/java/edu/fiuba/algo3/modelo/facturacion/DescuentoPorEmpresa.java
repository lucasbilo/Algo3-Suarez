package edu.fiuba.algo3.modelo.facturacion;

import edu.fiuba.algo3.modelo.alquiler.Alquiler;

public class DescuentoPorEmpresa implements ReglaDeFacturacion {

    public static final double PORCENTAJE_DESCUENTO = 0.05;

    @Override
    public double aplicar(Alquiler alquiler) {
        if (alquiler.alquilerEmpresarial()) {
            return (-1) * PORCENTAJE_DESCUENTO * alquiler.importe();
        }
        return 0;
    }
}
