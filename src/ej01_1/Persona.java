package ej01_1;

public class Persona {

	String nombre;
	int edad;
	boolean sexo;
	String nacionalidad;
	
	
	Persona(){
		nombre = "Sin nombre";
		nacionalidad = "Sin nacionalidad";
		sexo = true;
		edad = 0;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s | %s | %d | %s",nombre, nacionalidad, edad, sexo ? "hombre":"mujer" );
	}
	
	
	
	
	
	
	
	
	
}
