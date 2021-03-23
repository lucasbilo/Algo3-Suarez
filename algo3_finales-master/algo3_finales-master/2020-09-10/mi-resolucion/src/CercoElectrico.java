public class CercoElectrico implements ComponenteElectrico{

    private int metros;
    private int precioKw = 10;

    public CercoElectrico(int metros){
        this.metros = metros;
    }

    public int getConsumo(){
        return metros * precioKw;
    }

}
