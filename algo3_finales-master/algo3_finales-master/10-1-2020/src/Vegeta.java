public class Vegeta {

    private double vida = 6000;

    public void atacado(double danio){
        if(this.vida < 0){
            throw new VegetaEstaMuertoExcepcion();
        }
        this.vida -= danio;
    }

    public void atacar(Goku enemigo, Ataque ataque) {
        if (this.vida < 0){
            throw new VegetaEstaMuertoExcepcion();
        }
        enemigo.atacado(ataque.danio());

        enemigo.setVida(enemigo.getVida() - (100  + this.vida * 0.1));
    }
}