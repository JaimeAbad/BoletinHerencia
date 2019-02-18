package ej06;


public class Main {

	public static void main(String[] args) {

		Circulo circulo = new Circulo();
		Cuadrado cuadrado = new Cuadrado();
		Triangulo triangulo = new Triangulo();
		Rombo rombo = new Rombo();
		Forma formas[] = new Forma[4];
		formas[0] = circulo;
		formas[1] = cuadrado;
		formas[2] = triangulo;
		formas[3] = rombo;
		for(int i=0;i<formas.length;i++) {
			System.out.println(formas[i].identidad());
		}
	}

}
