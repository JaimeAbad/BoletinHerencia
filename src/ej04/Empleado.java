package ej04;

public class Empleado {

	private String nombre;
	private float numHoras, sueldoPorHora;
	
	Empleado(String nombre, float numHoras, float sueldoPorHora){
		this.nombre = nombre;
		this.numHoras = numHoras;
		this.sueldoPorHora = sueldoPorHora;
	}
	
	public float calcularSueldo() {
		return numHoras * sueldoPorHora;
	}
	
	public String toString() {
		return String.format("%s %.2f", nombre, calcularSueldo());
	}

	public float getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(float numHoras) {
		this.numHoras = numHoras;
	}

	public float getSueldoPorHora() {
		return sueldoPorHora;
	}

	public void setSueldoPorHora(float sueldoPorHora) {
		this.sueldoPorHora = sueldoPorHora;
	}
}
