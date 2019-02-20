package ej16;

public class Pez {

	protected String nombre;
	
	Pez(String nombre){
		this.nombre = nombre;
	}
	
	public boolean equals(Object obj) {
		boolean resultado = false;
		
		if(obj instanceof Pez && nombre.equals(((Pez) obj).nombre)) {
			resultado = true;
		}
		
		return resultado;
	}
	
	
}
