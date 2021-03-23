package disparos;

import naves.Nave;

public class DisparoNormal extends Disparo {

	@Override
	public void disparar(Nave n) {
		n.recibirDisparo(this);
	}

}
