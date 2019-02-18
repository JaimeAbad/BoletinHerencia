package ej01_2;

public class Profesor extends Persona{

	private float sueldo;
	
	
	Profesor(String nombre, String nacionalidad, boolean sexo, int edad, float sueldo){
		super(nombre, nacionalidad, sexo, edad);
		this.sueldo = sueldo;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s \t%.2f",super.toString(),sueldo );
	}
	
}

