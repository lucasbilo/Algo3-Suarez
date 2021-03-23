package modelo;

public class PortaBici implements Cargable{
    ConjuntoCarga conjuntoCarga;

    public PortaBici(){
        conjuntoCarga = new ConjuntoCarga();
    }

    public void cargar(Bici bici){
        this.conjuntoCarga.cargar(bici);
    }

    public void cargar(Helatodo helatodo){
        this.conjuntoCarga.cargar(helatodo);
    }

    public Cargas descargar(){
        return this.conjuntoCarga.descargar();
    }
}
