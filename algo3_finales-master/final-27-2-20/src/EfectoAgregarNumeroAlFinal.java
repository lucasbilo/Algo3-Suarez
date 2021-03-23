public class EfectoAgregarNumeroAlFinal implements Efecto{
    private int numeroAAgregar;

    public EfectoAgregarNumeroAlFinal(int numero){
        numeroAAgregar = numero;
    }
    @Override
    public String aplicarA(String unaCadena) {
        if (unaCadena.equals("")) {
            throw new CadenaVaciaExcepcion();
        }

        return unaCadena + numeroAAgregar;
    }
}
