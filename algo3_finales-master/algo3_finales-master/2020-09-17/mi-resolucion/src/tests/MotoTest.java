package tests;

import modelo.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MotoTest {

    @Test
    public void test01motoNoPuedeDescargarSiNoTieneNada(){
        Moto moto = new Moto();
        assertThrows(NoHayNadaParaDescargar.class, moto::descargar);
    }

    @Test
    public void test02motoCargaYDescargaUnHelatodo(){
        Moto moto = new Moto();
        Helatodo helatodo = new Helatodo();
        moto.cargar(helatodo);
        assertEquals(helatodo, moto.descargar());
    }

    @Test
    public void test03motoNoPuedeCargarBici(){
        Moto moto = new Moto();
        Bici bici = new Bici();
        assertThrows(NoSoportaCarga.class, () -> moto.cargar(bici));
    }

}
