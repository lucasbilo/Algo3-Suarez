public class Estufa implements ComponenteElectrico{
    private int precioKw = 10;
    private int calorias;
    private int ambientes;

    public Estufa(int calorias, int ambientes){
        this.calorias = calorias;
        this.ambientes = ambientes;
    }

    public int getConsumo(){
        return ambientes * precioKw * calorias;
    }

}
