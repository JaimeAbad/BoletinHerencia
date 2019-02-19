package ej14;

public class MainTest {

	public static void main(String[] args) {

		Planta p  = new Planta(20.80, "margarita",true);
		Alfareria a = new Alfareria(20.80, "basija",true);
		
		dameDatos(p);
		dameDatos(a);
	}

	public static void dameDatos(Mercancia producto) {
//		System.out.printf("%b\n%s\n" ,producto.damePrecio(), producto.dameDescripcion());
		System.out.println(producto.toString());
	}
}
