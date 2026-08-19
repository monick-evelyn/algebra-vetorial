package model;

public class Vetor3D extends Vetor{

	private double z;
	
	public Vetor3D(double x, double y, double z) {
		super(x,y);
		this.z = z;
	}

	public double getZ() {
		return z;
	}
	
	// Fórmula: raiz_quadrada(x² + y² + z²)
	public double modulo() {
		 double modulo = Math.sqrt(getX()*getX() + getY()*getY() + z*z);
		 return modulo;
	}

	@Override
	public String toString() {
		return "Vetor3D [" + getX() + ", " + getY() + ", " + z + "]";
	}
	
	
}
