package ej01_2;

public class MainPersona {

	public static void main(String[] args) {
		
		Profesor profe = new Profesor("Pedro", "Española",true, 47, 2300.76f);
		Alumno alumno = new Alumno("Jaime", "Española",true, 21, true);
		Persona persona;
		int n;
		
		System.out.println(profe.toString());
		System.out.println(alumno.toString());
		
		System.out.println("Que quieres crear? 1.alumno 2.profesor");
		n = Teclado.leerEntero();
		
		if(n == 1) {
			persona = alumno;
		}else {
			persona = profe;
		}
		
		System.out.println(persona.toString());
		
		
		
	}

}
