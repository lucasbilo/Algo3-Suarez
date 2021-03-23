package modelo;

public class Moto implements Cargable {
    ConjuntoCarga conjuntoCarga;

    public Moto() {
        this.conjuntoCarga = new ConjuntoCarga();
    }

    public void cargar(Bici bici) {
        throw new NoSoportaCarga();
    }

    public void cargar(Helatodo helatodo) {
        conjuntoCarga.cargar(helatodo);
    }

    public Cargas descargar() {
        return conjuntoCarga.descargar();
    }

}
