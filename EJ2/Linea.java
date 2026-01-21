package EJ2;

public class Linea {

	private Vertice puntoA;
	private Vertice puntoB;

	 public Linea(Vertice puntoA, Vertice puntoB) {
	        this.puntoA = puntoA;
	        this.puntoB = puntoB;
	    }
	 
	public void MueveArriba(double distancia) {
		 puntoA.setY(puntoA.getY() + distancia);
	     puntoB.setY(puntoB.getY() + distancia);
	}
	public void MueveAbajo(double distancia) {
		puntoA.setY(puntoA.getY() - distancia);
	    puntoB.setY(puntoB.getY() - distancia);
	}
	public void MueveDerecha(double distancia) {
		puntoA.setX(puntoA.getX() + distancia);
	    puntoB.setX(puntoB.getX() + distancia);
	}
	public void MueveIzquierda(double distancia) {
		puntoA.setX(puntoA.getX() - distancia);
	    puntoB.setX(puntoB.getX() - distancia);
	}

	@Override
	public String toString() {
		return "Linea [puntoA=" + puntoA + ", puntoB=" + puntoB + "]";
	}
	
}
