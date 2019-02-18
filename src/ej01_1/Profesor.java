package ej01_1;

public class Profesor extends Persona{

	private float sueldo;
	
	Profesor(){
		sueldo = 975.8f;
	}
	
	@Override
	public String toString() {
		return String.format("%s \t%.2f",super.toString(),sueldo );
	}
	
}

