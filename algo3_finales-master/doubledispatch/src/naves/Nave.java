package naves;

import disparos.Disparo;
import disparos.DisparoDoble;
import disparos.DisparoNormal;

public abstract class Nave implements Disparable{
	int vida;
	
	Nave(){
		vida = 3;
	}
	
	public int getVida() {
		return vida;
	}
	
	protected void recibirDanio(int d) {
		if (vida == 0) {
			System.out.println("Esta nave ya fue destruida. No puede ser dañada");
		} else {
			vida = Math.max(0, vida - d);
			if (vida == 0) {
				System.out.println("NAVE DESTRUIDA.");
			}
		}
	}
	
	public abstract void recibirDisparo(Disparo d);
	public abstract void recibirDisparo(DisparoDoble d); 
	public abstract void recibirDisparo(DisparoNormal d); 
}
