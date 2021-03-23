import java.util.ArrayList;
import java.util.List;

public class Casa{

    private final List<ComponenteElectrico> componentes = new ArrayList<>();

    public void agregarComponente(ComponenteElectrico componente){
        componentes.add(componente);
    }

    public int getGastoTotal() {
        return componentes.stream().mapToInt(ComponenteElectrico::getConsumo).sum();
    }

}

