package ej04;

public class MainEmployed {

	public static void main(String[] args) {

		Empleado e = new Empleado("Julio Lopez", 8.0f, 5.0f);
		Encargado c = new Encargado("Jaime Abad", 8.0f, 5.0f);
		
		
		e.calcularSueldo();
		System.out.println(e.toString());
		
		c.calcularSueldo();
		System.out.println(c.toString());
		
	}

}
