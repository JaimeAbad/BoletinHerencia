package ej15;

public class Planta extends Jardineria implements MercanciaViva{

	boolean regada;
	Planta(double precio, String descripcion, boolean regada){
		super(precio, descripcion);
		this.regada = regada;
	}
	@Override
	public double damePrecio() {
		return precio;
	}
	@Override
	public String dameDescripcion() {
		return descripcion;
	}
	
	
	public String toString() {
		return String.format("%s %b",super.toString(),regada);
	}
	@Override
	public boolean necesitaComida() {
		return false;
	}
	@Override
	public boolean necesitaRiego() {
		return false;
	}
	
	
}
