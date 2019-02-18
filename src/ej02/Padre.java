package ej02;

public class Padre {

	private int privado;
	public int publico;
	int friendly;
	protected int protegido;
	
	protected Padre(){
		
	}
	
	private void metodoPrivado() {
		privado = 1;
	}
	
	public void metodoPublico() {
		publico = 1;
	}
	void metodoFriendly() {
		friendly = 1;
	}
	
	protected void metodoProtegido() {
		protegido = 1;
	}
	
	
}
