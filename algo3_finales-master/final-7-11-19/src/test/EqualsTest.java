package test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import modelo.MiClase;

public class EqualsTest {
	
	@Test
	public void numeros_iguales() {
		MiClase valorEsperado = new MiClase(5); 
					
        assertEquals(valorEsperado, new MiClase(5));
	}

	@Test
	public void numeros_diferentes() {
		MiClase valorEsperado = new MiClase(5); 
			
		assertNotEquals(valorEsperado, new MiClase(10));
	}

}
