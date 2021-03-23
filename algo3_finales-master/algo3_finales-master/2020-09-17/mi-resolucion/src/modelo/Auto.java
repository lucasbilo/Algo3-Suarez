package modelo;

public class Auto implements Cargable, Equipable {
    private PortaBici equipo;

    public Auto() {
        equipo = new Ninguno();
    }

    public void equipar(PortaBici portaBici){
        equipo = portaBici;
    }

    public void cargar(Bici bici) {
        equipo.cargar(bici);
    }

    public void cargar(Helatodo helatodo) {
        equipo.cargar(helatodo);
    }

    public Cargas descargar() {
        return equipo.descargar();
    }

}
