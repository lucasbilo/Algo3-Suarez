package disparos;

import naves.Nave;

public class DisparoDoble extends Disparo {

	@Override
	public void disparar(Nave n) {
		n.recibirDisparo(this);
	}
	
}
