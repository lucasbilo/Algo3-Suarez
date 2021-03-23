public class EfectoDarVuelta implements Efecto{

    public String aplicarA(String unaCadena) {
        if (unaCadena.equals("")) {
            throw new CadenaVaciaExcepcion();
        }

        return new StringBuffer(unaCadena).reverse().toString();
    }

}
