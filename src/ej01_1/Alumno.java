package ej01_1;

public class Alumno extends Persona{

	private boolean repetidor;
	
	Alumno(){
		repetidor = false;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s \t%s",super.toString(),repetidor ? "Es repetidor":"No es repetidor");
	}
	
}
