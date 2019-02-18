package ej01_2;

public class Persona {

	String nombre;
	int edad;
	boolean sexo;
	String nacionalidad;
	
	
	Persona(String nombre, String nacionalidad, boolean sexo, int edad){
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s | %s | %d | %s",nombre, nacionalidad, edad, sexo ? "hombre":"mujer" );
	}
	
	
	
	
	
	
	
	
	
}
