package ej03;

public abstract class FiguraGeometrica {

	protected int x;
	protected int y;
	
	public FiguraGeometrica(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract float calcular_area();
	
	@Override
	public String toString() {
		return String.format("x: %d | y: %d",x,y);
	}
}
