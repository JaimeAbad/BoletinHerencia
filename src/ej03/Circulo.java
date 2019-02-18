package ej03;

public class Circulo extends FiguraGeometrica{

	private float radio;
	
	Circulo(int x, int y, int radio){
		super(x, y);
		this.radio = radio;
	}
	
	@Override
	public float calcular_area() {
		return (float) (Math.PI* (float)Math.pow(radio, 2.0f));
	}
	
	@Override
	public String toString() {
		return String.format("El rectangulo tiene las coordenadas %s y tiene un radio de %.2f, su area es : %.2f", super.toString(), radio, calcular_area());
	}

}
