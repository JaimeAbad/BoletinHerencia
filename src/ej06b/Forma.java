package ej06b;

public abstract class Forma {

	public String identidad() {
		String forma;
		
		if(this instanceof Circulo) {
			forma = "Circulo";
		}else if(this instanceof Cuadrado) {
			forma = "Cuadrado";
		}else if(this instanceof Triangulo){
			forma = "Triangulo";
		}else {
			forma = "Rombo";
		}
		return forma;
	}
	
	@Override
	public abstract String toString();
}
