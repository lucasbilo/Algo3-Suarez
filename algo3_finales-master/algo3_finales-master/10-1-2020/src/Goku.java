public class Goku {

    private KaiohKen kaiohKen = new KaiohKenX0();
    private double vida = 5000;


    public void aplicarKaiohKen(KaiohKen kaiohKen) {
        this.kaiohKen = kaiohKen;
    }

    public void atacar(Vegeta enemigo, Ataque ataque){
        if (this.vida < 0){
            throw new GokuEstaMuertoExcepcion();
        }
        double danio = ataque.danio() + kaiohKen.aplicarDanioA(this.vida);
        enemigo.atacado(danio);
    }

    public void atacado(double danio){
        if(this.vida < 0){
            throw new GokuEstaMuertoExcepcion();
        }
        this.vida -= danio;
    }
}