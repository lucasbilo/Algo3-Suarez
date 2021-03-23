package test;

import modelo.CentralUnicaGlobalDeNotificaciones;
import modelo.Dispositivos.CamaraInteligente;
import modelo.Dispositivos.TimbreInteligente;
import modelo.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    @Test
    public void usuarioCompraTimbreNuevoAunNoDeberiaRecibirUnTimbrazo() {
        Usuario usuario = new Usuario("Jorge");
        CentralUnicaGlobalDeNotificaciones central = new CentralUnicaGlobalDeNotificaciones();
        TimbreInteligente timbre = new TimbreInteligente(usuario, central);
        assertEquals(0, usuario.getTimbrazosNotificados());
    }

    @Test
    public void usuarioCompraTimbreSuenanElTimbreUnaVezUsuarioDeberiaHaberRecibidoUnTimbrazo() {
        Usuario usuario = new Usuario("Jorge");
        CentralUnicaGlobalDeNotificaciones central = new CentralUnicaGlobalDeNotificaciones();
        TimbreInteligente timbre = new TimbreInteligente(usuario, central);
        timbre.sonar();
        assertEquals(1, usuario.getTimbrazosNotificados());
    }

    @Test
    public void usuarioCompraTimbreSeDetectaMovimientoUnaVezUsuarioDeberiaHaberRecibidoUnaAlerta() {
        Usuario usuario = new Usuario("Jorge");
        CentralUnicaGlobalDeNotificaciones central = new CentralUnicaGlobalDeNotificaciones();
        TimbreInteligente timbre = new TimbreInteligente(usuario, central);
        timbre.notificarMovimiento();
        assertEquals(1, usuario.getMovimientosNotificados());
    }

    @Test
    public void usuarioCompraCamaraNuevaAunNoDeberiaRecibirUnaAlerta() {
        Usuario usuario = new Usuario("Jorge");
        CentralUnicaGlobalDeNotificaciones central = new CentralUnicaGlobalDeNotificaciones();
        CamaraInteligente camara = new CamaraInteligente(usuario, central);
        assertEquals(0, usuario.getMovimientosNotificados());
    }

    @Test
    public void usuarioCompraCamaraSeDetectaMovimientoUnaVezUsuarioDeberiaHaberRecibidoUnaAlerta() {
        Usuario usuario = new Usuario("Jorge");
        CentralUnicaGlobalDeNotificaciones central = new CentralUnicaGlobalDeNotificaciones();
        CamaraInteligente camara = new CamaraInteligente(usuario, central);
        camara.notificarMovimiento();
        assertEquals(1, usuario.getMovimientosNotificados());
    }

    @Test
    public void usuarioCompraTimbreYCamaraElTimbreDetectaUnMovimientoYCamaraDetectaDosMovimientosUsuarioDeberiaHaberRecibidoTresAlertas(){
        Usuario usuario = new Usuario("Jorge");
        CentralUnicaGlobalDeNotificaciones central = new CentralUnicaGlobalDeNotificaciones();
        TimbreInteligente timbre = new TimbreInteligente(usuario, central);
        CamaraInteligente camara = new CamaraInteligente(usuario, central);
        camara.notificarMovimiento();
        camara.notificarMovimiento();
        timbre.notificarMovimiento();
        assertEquals(3, usuario.getMovimientosNotificados());
    }

}
