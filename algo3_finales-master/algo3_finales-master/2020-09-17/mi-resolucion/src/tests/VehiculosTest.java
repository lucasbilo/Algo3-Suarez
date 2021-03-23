package tests;

import modelo.Auto;
import modelo.Cargas;
import modelo.Moto;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
/*
public class VehiculosTest {

    @Test
    public void test() {
        Auto auto = new Auto();

        auto.cargar(Cargas.HELATODO);

        Assertions.assertEquals(auto.descargar(), Cargas.HELATODO);
        assertThrows(EmptyStackException.class, () -> {
            auto.descargar();
        });

        assertThrows(RuntimeException.class, () -> {
            auto.cargar(Cargas.BICI);
        });

        // Moto
        Moto moto = new Moto();
        moto.cargar(Cargas.HELATODO);
        Assertions.assertEquals(moto.descargar(), Cargas.HELATODO);
    }

}
*/