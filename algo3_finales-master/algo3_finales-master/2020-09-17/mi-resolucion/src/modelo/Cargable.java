package modelo;

public interface Cargable {

    void cargar(Bici bici);

    void cargar(Helatodo helatodo);

    Cargas descargar();
}
