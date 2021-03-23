package ReplaceConditional;

public class Pajaro {

    private TipoAve tipo;
    private int velocidad;
    private int numeroDeCocos;

    public Pajaro(TipoAve tipo, int velocidad){
        this.tipo = tipo;
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        switch (tipo) {
            case EUROPEO:
                return getVelocidadBase();
            case AFRICANO:
                return getVelocidadBase() - getLoadFactor() * numeroDeCocos;
            case AZUL_NORUEGO:
                return (numeroDeCocos > 8) ? 0 : getVelocidadBase()*2;
        }
        throw new RuntimeException("Should be unreachable");
    }

    private double getLoadFactor() {
        // Algún cálculo
        return 85;
    }

    private double getVelocidadBase() {
        return velocidad;
    }
}
