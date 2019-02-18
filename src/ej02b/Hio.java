package ej02b;

import ej02.Padre;

public class Hio extends Padre{

	Hio(){
		super();
		//metodoPrivado(); not visible
		metodoPublico();
		//metodoFriendly(); not visible
		metodoProtegido();
		//privado = 2; not visible
		publico = 2;
		//friendly =2; not visible
		protegido = 2;
	}
}
