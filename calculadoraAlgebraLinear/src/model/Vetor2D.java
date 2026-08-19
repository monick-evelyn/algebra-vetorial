package model;

public class Vetor2D extends Vetor {
	
	public Vetor2D(double x, double y) {
		super(x,y);
	}
	
	// Fórmula: raiz_quadrada(x² + y² + z²)
	public double modulo() {
		 double modulo = Math.sqrt(getX()*getX() + getY()*getY());
		 return modulo;
	}

	@Override
	public String toString() {
		return "Vetor2D [" + getX() + ", " + getY() + "]";
	}
}
