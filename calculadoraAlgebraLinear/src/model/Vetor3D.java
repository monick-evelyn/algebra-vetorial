package model;

public class Vetor3D {
	private double x;
	private double y;
	private double z;
	
	public Vetor3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}
	
	// Fórmula: raiz_quadrada(x² + y² + z²)
	public double modulo() {
		 double modulo = Math.sqrt(x*x + y*y + z*z);
		 return modulo;
	}

	@Override
	public String toString() {
		return "Vetor3D [" + x + ", " + y + ", " + z + "]";
	}
	
	
}
