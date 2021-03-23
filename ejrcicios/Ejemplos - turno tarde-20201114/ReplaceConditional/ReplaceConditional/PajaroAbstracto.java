package ReplaceConditional;

public abstract class PajaroAbstracto {
    protected int velocidad;
    protected int numeroDeCocos;

    protected double getLoadFactor() {
        // Algún cálculo
        return 85;
    }

    protected double getVelocidadBase() {
        return velocidad;
    }

    abstract public double getVelocidad();
}
