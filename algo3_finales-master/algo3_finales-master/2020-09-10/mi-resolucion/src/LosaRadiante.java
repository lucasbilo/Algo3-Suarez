public class LosaRadiante implements ComponenteElectrico {
    private int metros;
    private int precioKw = 10;

    public LosaRadiante(int metros){
        this.metros = metros;
    }

    public int getConsumo(){
        return precioKw * metros * metros;
    }
}
