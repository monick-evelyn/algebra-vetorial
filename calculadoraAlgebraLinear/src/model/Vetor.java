package model;

public abstract class Vetor {
		private double x;
		private double y;
		
		public Vetor(double x, double y) {
			validaCoordenada(x);
			validaCoordenada(y);
			this.x = x;
			this.y = y;
		}
		
		protected void validaCoordenada(double coord) {
			if (Double.isNaN(coord)) {
				throw new IllegalArgumentException("As coordenadas do vetor não podem ser NaN.");
			}
		}

		public double getX() {
			return x;
		}

		public double getY() {
			return y;
		}
		
		public abstract double modulo();

		@Override
		public abstract String toString();
	
}
