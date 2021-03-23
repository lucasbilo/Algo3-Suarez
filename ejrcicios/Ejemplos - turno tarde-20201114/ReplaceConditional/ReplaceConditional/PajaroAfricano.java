package ReplaceConditional;

public class PajaroAfricano extends PajaroAbstracto {
    public PajaroAfricano(int velocidad) {
        this.velocidad = velocidad;
    }
    @Override
    public double getVelocidad() {
        return getVelocidadBase() - getLoadFactor() * numeroDeCocos;
    }
}
