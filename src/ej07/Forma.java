package ej07;

public abstract class Forma {

	public String identidad() {
		return this.getClass().getSimpleName();
	}
	
	@Override
	public abstract String toString();
}
