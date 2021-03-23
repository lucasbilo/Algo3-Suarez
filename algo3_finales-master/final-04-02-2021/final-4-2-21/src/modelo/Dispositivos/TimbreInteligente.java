package modelo.Dispositivos;

import modelo.CentralUnicaGlobalDeNotificaciones;
import modelo.Funcionalidades.DetectarMovimiento;
import modelo.Funcionalidades.Sonar;
import modelo.Usuario;

public class TimbreInteligente extends DispositivoInteligente implements Sonar, DetectarMovimiento {

    public TimbreInteligente(Usuario usuario, CentralUnicaGlobalDeNotificaciones central){
        this.duenio = usuario;
        this.central = central;
    }

    @Override
    public void notificarMovimiento(){
        central.notificarMovimiento(duenio);
    }

    @Override
    public void sonar(){
        central.notificarSonido(duenio);
    }
}
