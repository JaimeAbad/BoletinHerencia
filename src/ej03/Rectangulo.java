package ej03;

public class Rectangulo extends FiguraGeometrica{

	private int base, altura;
	
	Rectangulo(int x, int y, int base, int altura){
		super(x,y);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public float calcular_area() {
		return base*altura; 
	}

	public String toString() {
		return String.format("El rectangulo tiene las coordenadas %s y tiene una base de %d y una altura de %d por lo tanto su area es : %.2f", super.toString(), base, altura, calcular_area());
	}
	
}
