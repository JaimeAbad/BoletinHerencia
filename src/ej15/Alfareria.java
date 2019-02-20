package ej15;


public class Alfareria extends Jardineria implements MercanciaFragil {

	boolean fragil;
	Alfareria(double precio, String descripcion, boolean fragil){
		super(precio, descripcion);
		this.fragil = fragil;
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
		return String.format("%s %b",super.toString(),fragil);
	}
	@Override
	public String dameEmbalaje() {
		return null;
	}
	@Override
	public double damePeso() {
		return 0;
	}
	
}
