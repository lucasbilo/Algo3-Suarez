package modelo;

public class Ninguno extends PortaBici{

    public void cargar(Bici bici){
        throw new NoSoportaCarga();
    }
}
