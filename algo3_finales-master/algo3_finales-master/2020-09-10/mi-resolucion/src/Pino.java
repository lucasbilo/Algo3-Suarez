public class Pino extends Madera {
    private static final int precioPorKg = 2;
    private static final int coeficienteCalorico = 3;

    public Pino(int cantidad){
        super(cantidad, precioPorKg);
    }

    public int gasto(int metros){
        return (metros * precioPorKg * cantidad) / coeficienteCalorico;
    }
}
