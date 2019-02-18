package ej03;

public class Triangulo extends FiguraGeometrica{

	private int base, altura;
	Triangulo(int x, int y, int base, int altura){
		super(x, y);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public float calcular_area() {
		return base*altura /2;
	}
	
	
	public String toString() {
		return String.format("El triangulo tiene las coordenadas %s y tiene una base de %d y una altura de %d , por lo tanto su area es: %.2f", super.toString(), base, altura, calcular_area());
	}
}
