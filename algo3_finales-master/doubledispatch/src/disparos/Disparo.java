package disparos;

import naves.Nave;

public abstract class Disparo {
	int posx;
	int posy; // irrelevantes para este ejemplo.
	
	// Acá habría métodos significativos como "mover(x,y)" y demás. Es lo que hay. Llegó el ajuste.
	
	public abstract void disparar(Nave n);
}
