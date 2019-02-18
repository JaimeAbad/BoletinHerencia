package ej06c;

public class Circulo extends Forma{

	@Override
	public String identidad() {
		return this.toString();
	}
	@Override
	public String toString() {
		return String.format("Soy un circulo");
	}

}
