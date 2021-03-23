import java.util.ArrayList;
import java.util.List;

public class Salamandra implements ComponenteElectrico{
    private int capacidadMax = 15;
    private int cantidad;
    private int metros;
    private List<Madera> maderas = new ArrayList<>();

    public Salamandra(int metros){
        this.metros = metros;
    }
    public int getConsumo(){
        return maderas.stream().mapToInt(a -> a.gasto(metros)).sum();
    }

    public void agregarMadera(Madera madera){
        if(madera.getCantidad() + cantidad > capacidadMax){
            throw new NoSePuedeAgregarMasDe15KgExcepcion();
        }
        maderas.add(madera);
        this.cantidad += madera.getCantidad();
    }

}
