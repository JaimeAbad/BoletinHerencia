package ej06c;

public class Cuadrado extends Forma{

	@Override
	public String identidad() {
		return this.toString();
	}
	@Override
	public String toString() {
		return String.format("Soy un cuadrado");
	}
}
