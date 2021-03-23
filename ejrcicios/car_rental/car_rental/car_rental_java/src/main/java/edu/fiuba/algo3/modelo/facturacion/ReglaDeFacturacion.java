package edu.fiuba.algo3.modelo.facturacion;

import edu.fiuba.algo3.modelo.alquiler.Alquiler;

public interface ReglaDeFacturacion {
    double aplicar(Alquiler alquiler);
}
