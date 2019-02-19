package ej13;

public class Coche extends Vehiculo {

	@Override
	public int getVelocidadActual() {
		return 0;
	}
	
	// la clase vehiculo si puede tener descendencia, lo que no se puede es instanciar a ella misma ya que es abstract
	// se pueden sobreescribir los metodos abstractos o normales, no los final

}
