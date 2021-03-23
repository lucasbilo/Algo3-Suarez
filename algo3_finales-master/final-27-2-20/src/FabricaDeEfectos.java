public class FabricaDeEfectos {

    public String AplicarEfectoAgregarCincoAlFinalA(String unaCadena){
        Efecto efecto = new EfectoAgregarNumeroAlFinal(5);
        return efecto.aplicarA(unaCadena);
    }

    public String AplicarEfectoAgregarOchoAlFinalA(String unaCadena){
        Efecto efecto = new EfectoAgregarNumeroAlFinal(8);
        return efecto.aplicarA(unaCadena);
    }

    public String AplicarEfectoDarVueltaYPrimeraMayusculaA(String unaCadena){
        Efecto efectoMayuscula = new EfectoPrimeraMayuscula();
        Efecto efectoDarVuelta = new EfectoDarVuelta();
        return efectoMayuscula.aplicarA(efectoDarVuelta.aplicarA(unaCadena));
    }

    public String AplicarEfectoPrimeraMayusculaA(String unaCadena){
        Efecto efecto = new EfectoPrimeraMayuscula();
        return efecto.aplicarA(unaCadena);
    }

    public String AplicarEfectoPrimeraMayusculaYAgregarOchoA(String unaCadena){
        Efecto efectoMayuscula = new EfectoPrimeraMayuscula();
        Efecto efectoNumero = new EfectoAgregarNumeroAlFinal(8);
        return efectoNumero.aplicarA(efectoMayuscula.aplicarA(unaCadena));
    }

    public String AplicarEfectoPrimeraMinusculaYAgregarTresA(String unaCadena){
        Efecto efectoNumero = new EfectoAgregarNumeroAlFinal(3);
        Efecto efectoMinuscula = new EfectoPrimeraMinuscula();
        return efectoNumero.aplicarA(efectoMinuscula.aplicarA(unaCadena));
    }

    public String AplicarEfectoDarVueltaPrimeraMinusculaYAgregarCuatroA(String unaCadena){
        Efecto efectoNumero = new EfectoAgregarNumeroAlFinal(4);
        Efecto efectoMinuscula = new EfectoPrimeraMinuscula();
        Efecto efectoDarVuelta = new EfectoDarVuelta();
        return efectoNumero.aplicarA(efectoMinuscula.aplicarA(efectoDarVuelta.aplicarA(unaCadena)));
    }

}
