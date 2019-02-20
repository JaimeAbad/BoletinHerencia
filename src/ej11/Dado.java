package ej11;

public class Dado extends Sorteo {

	@Override
	public int lanzar() {
		return (int)(Math.random()* 6) + 1;
	}

}
