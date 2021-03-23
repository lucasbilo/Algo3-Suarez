package ReplaceConditional;

public class PajaroEuropeo extends PajaroAbstracto {

    public PajaroEuropeo(int velocidad) {
        this.velocidad = velocidad;
    }
    @Override
    public double getVelocidad() {
        return getVelocidadBase();
    }
}
