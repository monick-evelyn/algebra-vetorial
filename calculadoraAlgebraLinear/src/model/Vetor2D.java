package model;

public class Vetor2D {
	private double x;
	private double y;
	
	public Vetor2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	// Fórmula: raiz_quadrada(x² + y² + z²)
	public double modulo() {
		 double modulo = Math.sqrt(x*x + y*y);
		 return modulo;
	}

	@Override
	public String toString() {
		return "Vetor2D [" + x + ", " + y + "]";
	}
}
