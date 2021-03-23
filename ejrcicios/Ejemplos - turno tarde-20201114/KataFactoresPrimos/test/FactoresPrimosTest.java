import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FactoresPrimosTest {
    @Test
    public void testA(){
        Assert.assertTrue(factoresPrimosDe(1).isEmpty());
    }

    @Test
    public void testB(){
        Assert.assertEquals(Arrays.asList(2), factoresPrimosDe(2));
    }

    @Test
    public void testC(){
        Assert.assertEquals(Arrays.asList(3), factoresPrimosDe(3));
    }

    @Test
    public void testD(){
        Assert.assertEquals(Arrays.asList(2,2), factoresPrimosDe(4));
    }

    @Test
    public void testE(){
        Assert.assertEquals(Arrays.asList(2, 3), factoresPrimosDe(6));
    }

    @Test
    public void testF(){
        Assert.assertEquals(Arrays.asList(2,2,2), factoresPrimosDe(8));
    }

    @Test
    public void testG(){
        Assert.assertEquals(Arrays.asList(3, 3), factoresPrimosDe(9));
    }

    @Test
    public void testH(){
        Assert.assertEquals(Arrays.asList(2, 2, 3, 5, 7, 11), factoresPrimosDe(4620));
    }

//    private List<Integer> factoresPrimosDe(Integer numeroAFactorizar) {
//        var factoresPrimos = new ArrayList<Integer>();
//        int divisor = 2;
//        while (numeroAFactorizar > 1) {
//            while (numeroAFactorizar % divisor == 0) {
//                factoresPrimos.add(divisor);
//                numeroAFactorizar /= divisor;
//            }
//            divisor++;
//        }
//        return factoresPrimos;
//    }

    private List<Integer> factoresPrimosDe(Integer numeroAFactorizar) {

        return FactoresPrimos.De(numeroAFactorizar);
    }

}
