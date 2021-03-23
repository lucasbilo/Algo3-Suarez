public class Quebraco extends Madera {
    private static final int precioPorKg = 4;
    private static final int pureza = 2;

    public Quebraco(int cantidad){
        super(cantidad, precioPorKg);
    }
    public int gasto(int metros){
        return precioPorKg * pureza * cantidad * metros;
    }
}
