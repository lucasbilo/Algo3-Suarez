import java.util.ArrayList;
import java.util.List;

public class FactoresPrimos {

    private Integer numeroAFactorizar;
    private ArrayList<Integer> factoresPrimos;
    private int divisor;

    public FactoresPrimos(Integer numeroAFactorizar) {

        this.numeroAFactorizar = numeroAFactorizar;
    }

    public static List<Integer> De(Integer numeroAFactorizar) {
        return (new FactoresPrimos(numeroAFactorizar)).calcular();
    }

    private List<Integer> calcular() {
        InicializarValores();

        while (puedeSeguirFactorizando()) {
            FactorizarPorElDivisor();
            CalcularSiguienteDivisor();
        }
        return factoresPrimos;
    }

    private void CalcularSiguienteDivisor() {
        divisor++;
    }

    private void FactorizarPorElDivisor() {
        while (numeroAFactorizar % divisor == 0) {
            factoresPrimos.add(divisor);
            numeroAFactorizar /= divisor;
        }
    }

    private boolean puedeSeguirFactorizando() {
        return numeroAFactorizar > 1;
    }

    private void InicializarValores() {
        factoresPrimos = new ArrayList<Integer>();
        divisor = 2;
    }
}
