import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.Test;

public class EfectosTest {

    @Test
    public void testAgregarCincoAlFinal() {
        FabricaDeEfectos fabrica = new FabricaDeEfectos();
        String cadena = fabrica.AplicarEfectoAgregarCincoAlFinalA("algo");
        Assert.assertEquals("algo5", cadena);
    }

    @Test
    public void testAgregarOchoAlFinal() {
        FabricaDeEfectos fabrica = new FabricaDeEfectos();
        String cadena = fabrica.AplicarEfectoAgregarOchoAlFinalA("ALGO");
        Assert.assertEquals("ALGO8", cadena);
    }

    @Test
    public void testDarVueltaYPrimeraMayuscula() {
        FabricaDeEfectos fabrica = new FabricaDeEfectos();
        String cadena = fabrica.AplicarEfectoDarVueltaYPrimeraMayusculaA("algo");
        Assert.assertEquals("Ogla", cadena);
    }

    @Test
    public void testPrimeraMayuscula() {
        FabricaDeEfectos fabrica = new FabricaDeEfectos();
        String cadena = fabrica.AplicarEfectoPrimeraMayusculaA("algo");
        Assert.assertEquals("Algo", cadena);
    }

    @Test
    public void testPrimeraMayusculaYAgregarOcho() {
        FabricaDeEfectos fabrica = new FabricaDeEfectos();
        String cadena = fabrica.AplicarEfectoPrimeraMayusculaYAgregarOchoA("algo");
        Assert.assertEquals("Algo8", cadena);
    }

    @Test
    public void testEfectoAgregarCincoAlFinalNoSeAplicaACadenaVacia(){
        FabricaDeEfectos fabrica = new FabricaDeEfectos();
        assertThrows(CadenaVaciaExcepcion.class,() -> fabrica.AplicarEfectoAgregarCincoAlFinalA(""));
    }

    @Test
    public void testPrimeraMinusculaYAgregarTres() {
        FabricaDeEfectos fabrica = new FabricaDeEfectos();
        String cadena = fabrica.AplicarEfectoPrimeraMinusculaYAgregarTresA("ALGO");
        Assert.assertEquals("aLGO3", cadena);
    }

    @Test
    public void testDarVueltaPrimeraMinusculaYAgregarCuatro() {
        FabricaDeEfectos fabrica = new FabricaDeEfectos();
        String cadena = fabrica.AplicarEfectoDarVueltaPrimeraMinusculaYAgregarCuatroA("ALGO");
        Assert.assertEquals("oGLA4", cadena);
    }

}
