package ej01_1;

public class MainPersona {

	public static void main(String[] args) {
		
		Profesor profe = new Profesor();
		Alumno alumno = new Alumno();
		Persona persona;
		int n;
		
		System.out.println(profe.toString());
		System.out.println(alumno.toString());
		
		System.out.println("Que quieres crear? 1.alumno 2.profesor");
		n = Teclado.leerEntero();
		
		if(n == 1) {
			persona = new Alumno();
		}else {
			persona = new Profesor();
		}
		
		System.out.println(persona.toString());
		
		
		
	}

}
