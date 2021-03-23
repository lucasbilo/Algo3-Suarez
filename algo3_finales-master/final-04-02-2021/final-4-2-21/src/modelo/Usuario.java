package modelo;

import modelo.Alertas.Alerta;

public class Usuario {

    private int timbrazosRecibidos = 0;
    private int alertasDeMovimientoRecibidas = 0;
    private final String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void notificarMovimiento(Alerta alerta) {
        alertasDeMovimientoRecibidas+=1;
    }

    public void notificarTimbre(){
        timbrazosRecibidos+=1;
    }

    public int getMovimientosNotificados(){
        return alertasDeMovimientoRecibidas;
    }

    public int getTimbrazosNotificados(){
        return timbrazosRecibidos;
    }
}
