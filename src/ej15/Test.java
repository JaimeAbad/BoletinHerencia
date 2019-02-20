package ej15;

import ej14.Mercancia;

public class Test {

	public static void main(String[] args) {

		Planta planta = new Planta(20.0,"margarita", true);
		Alfareria alfareria = new Alfareria(202.0,"mastil", true);
		
//		dameDatos(planta);
//		dameDatos(alfareria);
	}
	public static void dameDatos(Mercancia producto) {
		if(producto instanceof Mercancia) {
			producto.damePrecio();
			producto.dameDescripcion();
		}else if(producto instanceof MercanciaViva) {
			((MercanciaViva) producto).necesitaComida();
			((MercanciaViva) producto).necesitaRiego();
		}else if(producto instanceof MercanciaFragil) {
			((MercanciaFragil) producto).dameEmbalaje();
			((MercanciaFragil) producto).damePeso();
		}else {
			System.out.println("nasin");
		}
	}
}
