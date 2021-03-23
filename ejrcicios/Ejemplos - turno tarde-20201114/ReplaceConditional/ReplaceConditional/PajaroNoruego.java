package ReplaceConditional;

public class PajaroNoruego extends PajaroAbstracto {
    public PajaroNoruego(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public double getVelocidad() {
        return (numeroDeCocos > 8) ? 0 : getVelocidadBase()*2;
    }
}
