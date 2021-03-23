package naves;

import disparos.Disparo;
import disparos.DisparoDoble;
import disparos.DisparoNormal;

public class NaveNormal extends Nave{
	
	
	public void recibirDisparo(DisparoNormal d){
		System.out.println("[nave normal]: HE RECIBIDO UN DISPARO OH JESUS");
		recibirDanio(1);
	}
	
	public void recibirDisparo(DisparoDoble d) {
		System.out.println("[nave normal]: HE RECIBIDO UN DISPARO DOBLE OH SEÑOR SALVANOS.");
		recibirDanio(2);
	}

	@Override
	public void recibirDisparo(Disparo d) {
		System.out.println("[nave normal]: recibiendo un disparo genérico. No sé de qué clase es. MOMENTO DEL DOUBLE DISPATCH, BITCHES");
		d.disparar(this);
	}
	
}
