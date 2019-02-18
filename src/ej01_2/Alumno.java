package ej01_2;

public class Alumno extends Persona{

	private boolean repetidor;
	
	Alumno(String nombre, String nacionalidad, boolean sexo, int edad, boolean repetidor){
		super(nombre, nacionalidad, sexo, edad);
		this.repetidor = repetidor;
	}
	
	
	
	@Override
	public String toString() {
		return String.format("%s \t%s",super.toString(),repetidor ? "Es repetidor":"No es repetidor");
	}
	
}
