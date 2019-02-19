package ej14;

public class Jardineria {

	double precio;
	String descripcion;
	
	Jardineria(double precio, String descripcion){
		this.precio = precio;
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return String.format("precio: %b\ndescripcion: %s", precio, descripcion);
	}
}
