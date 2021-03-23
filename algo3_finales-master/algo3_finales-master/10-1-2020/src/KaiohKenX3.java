public class KaiohKenX3 implements KaiohKen{

    private double porcentajeDanio = 0.15;
    private int cantidadTurnos = 3;

    public double aplicarDanioA(double vida){
        if(cantidadTurnos < 0){
            return 0;
        }
        cantidadTurnos--;
        return vida * porcentajeDanio;
    }
}
