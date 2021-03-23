public class EfectoPrimeraMinuscula implements Efecto{

    public String aplicarA(String unaCadena) {
        if (unaCadena.equals("")) {
            throw new CadenaVaciaExcepcion();
        }

        return unaCadena.substring(0,1).toLowerCase() + unaCadena.substring(1);
    }
}
