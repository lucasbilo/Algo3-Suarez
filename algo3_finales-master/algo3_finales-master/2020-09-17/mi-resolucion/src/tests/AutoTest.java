package tests;

import modelo.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AutoTest {

    @Test
    public void test01autoNoPuedeDescargarSiNoTieneNada(){
        Auto auto = new Auto();
        assertThrows(NoHayNadaParaDescargar.class, auto::descargar);
    }

    @Test
    public void test02autoCargaYDescargaUnHelatodo(){
        Auto auto = new Auto();
        Helatodo helatodo = new Helatodo();
        auto.cargar(helatodo);
        assertEquals(helatodo, auto.descargar());
    }

    @Test
    public void test03autoNoPuedeCargarBiciSinPortaBici(){
        Auto auto = new Auto();
        Bici bici = new Bici();
        assertThrows(NoSoportaCarga.class, () -> auto.cargar(bici));
    }

    @Test
    public void test04autoConPortaBiciCargaYDescargaUnaBici(){
        Auto auto = new Auto();
        Bici bici = new Bici();

        auto.equipar(new PortaBici());
        auto.cargar(bici);
        assertEquals(bici, auto.descargar());

    }

    @Test
    public void test05autoEquipadoConPortaBiciCargaYDescargaBiciYHelatodo() {
        Auto auto = new Auto();
        auto.equipar(new PortaBici());
        Bici bici = new Bici();
        Helatodo helatodo = new Helatodo();

        auto.cargar(bici);
        auto.cargar(helatodo);
        assertEquals(helatodo, auto.descargar());
        assertEquals(bici, auto.descargar());
    }
}