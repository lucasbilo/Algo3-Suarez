package edu.fiuba.algo3.modelo.facturacion;

import edu.fiuba.algo3.modelo.alquiler.Alquiler;

public class PenalizacionPorDevolucionTardia implements ReglaDeFacturacion {
    @Override
    public double aplicar(Alquiler alquiler) {
        if (alquiler.devolucionTardia()) {
            return alquiler.importe();
        }
        return 0;
    }
}
