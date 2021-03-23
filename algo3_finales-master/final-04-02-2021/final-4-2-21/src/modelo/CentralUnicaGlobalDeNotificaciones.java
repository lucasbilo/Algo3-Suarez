package modelo;

import modelo.Alertas.AlertaEspecial;
import modelo.Alertas.AlertaNormal;

public class CentralUnicaGlobalDeNotificaciones {

    public void notificarSonido(Usuario usuario){
        usuario.notificarTimbre();
    }

    public void notificarMovimiento(Usuario usuario){
        if(usuario.getMovimientosNotificados() % 3 == 0){
            usuario.notificarMovimiento(new AlertaEspecial());
        }
        else{
            usuario.notificarMovimiento(new AlertaNormal());
        }
    }
}
