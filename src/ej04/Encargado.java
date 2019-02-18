package ej04;

public class Encargado extends Empleado{

	
	Encargado(String nombre,float numHoras, float sueldoPorHora){
		super(nombre, numHoras, sueldoPorHora);
	}
	@Override
	public float calcularSueldo() {
		return  super.calcularSueldo() * 1.21f;
	}
	

}
