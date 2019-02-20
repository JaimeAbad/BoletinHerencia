package ej11;

import java.util.Random;

public class Moneda extends Sorteo{

	@Override
	public int lanzar() {
		Random rnd = new Random();
		
		return rnd.nextBoolean() ? "Cara".charAt(0) : "Cruz".charAt(0); 
	}


}
