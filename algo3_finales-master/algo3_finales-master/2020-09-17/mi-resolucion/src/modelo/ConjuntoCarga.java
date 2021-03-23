package modelo;

import java.util.Stack;

public class ConjuntoCarga implements Cargable{
    Stack<Cargas> cargas;

    public ConjuntoCarga(){
        cargas = new Stack<>();
    }

    public void cargar(Bici bici){
        this.cargas.push(bici);
    }

    public void cargar(Helatodo helatodo){
        this.cargas.push(helatodo);
    }

    public Cargas descargar(){
        if(cargas.isEmpty()){
            throw new NoHayNadaParaDescargar();
        }
        return cargas.pop();
    }

}
