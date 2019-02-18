package ej06c;

public class Triangulo extends Forma{

	@Override
	public String identidad() {
		return this.toString();
	}
	@Override
	public String toString() {
		return String.format("Soy un triangulo");
	}
}
