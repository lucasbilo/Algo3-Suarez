package juego;

import java.util.List;

import disparos.Disparo;
import disparos.DisparoDoble;
import disparos.DisparoNormal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import naves.Nave;
import naves.NaveCopada;
import naves.NaveNormal;

public class Juego {
	public static void main(String args[]) {
		System.out.println("Bienvenido al juego de double dispatch. Usted no puede hacer nada. Oserve lo que ocurre");
		
//		Como las listas son genericas todo lo que hay es tipo Nave y Disparo
//		entonces cuando a una nave se le dice que reciba un disparo de la lista, cae en la versión genérica, 
//		porque la lista es genérica. Entonces como no sabe de qué clase es, le manda un mensaje al disparo de "disparame"
//		El disparo entonces le responde llamando a la función "recibirDisparo(this)" pero ese this 
//		es el de la clase correspondiente.
//		Entonces la segunda vez entra al recibirDisparo(DisparoNormal), por ejemplo.
		
		List<Nave> naves = new ArrayList<Nave>(Arrays.asList(
				new NaveNormal(), 
				new NaveCopada()
				));
		List<Disparo> disparos = new ArrayList<Disparo>(Arrays.asList(
				new DisparoNormal(),
				new DisparoNormal(),
				new DisparoDoble(),
				new DisparoDoble()
		));
		
		Iterator<Nave> i = naves.iterator();
		Iterator<Disparo> j;
		
		Nave n;
		Disparo d;
		
		while(i.hasNext()) {
			n = i.next();
			j = disparos.iterator();
			while(j.hasNext()) {
				d = j.next();
				n.recibirDisparo(d);
			}
		}
	}
}
