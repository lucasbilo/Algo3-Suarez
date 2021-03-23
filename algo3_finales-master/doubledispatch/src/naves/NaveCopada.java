package naves;

import disparos.Disparo;
import disparos.DisparoDoble;
import disparos.DisparoNormal;

public class NaveCopada extends Nave {
	
	public void recibirDisparo(DisparoNormal d){
		System.out.println("[nave copada]: Un disparo normal no me hace nada, vieja.");
	}
	
	public void recibirDisparo(DisparoDoble d) {
		System.out.println("[nave copada]: Un disparo doble no me hace tanto...");
		recibirDanio(1);
	}

	@Override
	public void recibirDisparo(Disparo d) {
		System.out.println("[nave copada]: recibiendo un disparo genérico. No sé de qué clase es. MOMENTO DEL DOUBLE DISPATCH, BITCHES");
		d.disparar(this);
	}
}
