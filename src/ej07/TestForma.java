package ej07;

public class TestForma {

	public static void main(String[] args) {

		Forma f=new Circulo();
		f.identidad();
		Circulo c= new Circulo();
		((Forma)c).identidad();
		((Circulo)f).identidad();
		/*Forma f2=new Forma();
		f2.identidad(); no se puede hacer pq no se puede instanciar un objeto de Forma porque es una clase abstracta*/
//		(Forma)f.identidad();
//		f=c;
//		c=f;
	}

}
