public abstract class Madera {

    protected int cantidad;
    protected int precioPorKg;

    public Madera(int cantidad, int precio){
        if(cantidad == 0){
            throw new NoSePuedeCrearMaderaSinCantidad();
        }
        this.cantidad = cantidad;
        this.precioPorKg = precio;
    }

    abstract int gasto(int metros);

    public int getCantidad(){
        return cantidad;
    }
}
