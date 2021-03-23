package modelo.Dispositivos;

import modelo.CentralUnicaGlobalDeNotificaciones;
import modelo.Funcionalidades.DetectarMovimiento;
import modelo.Usuario;

public class CamaraInteligente extends DispositivoInteligente implements DetectarMovimiento {

    public CamaraInteligente(Usuario usuario, CentralUnicaGlobalDeNotificaciones central){
        this.duenio = usuario;
        this.central = central;
    }

    @Override
    public void notificarMovimiento() {
        central.notificarMovimiento(duenio);
    }
}
