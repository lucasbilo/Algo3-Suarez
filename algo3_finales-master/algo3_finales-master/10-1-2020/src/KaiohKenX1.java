public class KaiohKenX1 implements KaiohKen{
    private double porcentajeDanio = 0.05;
    private int cantidadTurnos = 4;

    public double aplicarDanioA(double vida){
        if(cantidadTurnos < 0){
            return 0;
        }
        cantidadTurnos--;
        return vida * porcentajeDanio;
    }
}