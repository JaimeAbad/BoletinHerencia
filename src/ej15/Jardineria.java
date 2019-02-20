package ej15;

public class Jardineria {

	double precio;
	String descripcion;
	
	Jardineria(double precio,String descripcion){
		this.precio = precio;
		this.descripcion = descripcion;
	}
	
	
	public String toString() {
		return String.format("%.2f %s",precio, descripcion);
	}
}
