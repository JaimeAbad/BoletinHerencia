package ej14;

public class Planta extends Jardineria implements Mercancia{

	boolean regada;
	Planta(double precio, String descripcion, boolean regada) {
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

	@Override
	public String toString() {
		return String.format("%s %s",super.toString(), regada ? "esta regada":"no esta regada" );
	}
}
