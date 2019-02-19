package ej14;

public class Alfareria extends Jardineria implements Mercancia {

	boolean fragil;
	Alfareria(double precio, String descripcion, boolean fragil) {
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

	@Override
	public String toString() {
		return String.format("%s %s",super.toString(), fragil ? "es fragil":"no es fragil" );
	}
}
