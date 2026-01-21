package EJ3;

public class Cafeteria {
	private int capacidadMaxima;
	private int cantidadActual;
	
	
	
	public Cafeteria(int capacidadMaxima) {
		super();
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual=0;
	}

	public void llenar() {
		this.cantidadActual=this.capacidadMaxima;
	}
	
	public int servirTaza(int cantidad) {
		int servido=this.cantidadActual-cantidad;
		this.cantidadActual-=cantidad;
		if(servido<0) {
			this.cantidadActual=0;
			return cantidad+servido;
		}
		return cantidad;
	}
	//version corta
	/*
	 * public int servirTaza(int cantidad) {
    int servido = Math.min(cantidad, this.cantidadActual);
    this.cantidadActual -= servido;
    return servido;
}
	 */
	public void vaciar() {
		this.cantidadActual=0;
	}
	
	public int agregarCafe(int cantidad) {
		this.cantidadActual+=cantidad;
		if(this.cantidadActual>capacidadMaxima) {
			int diferencia =this.cantidadActual-capacidadMaxima;
			this.cantidadActual=capacidadMaxima;
			return cantidad-diferencia;
		}
		return cantidad;
	}
	//corta
	/*
	 * public int agregarCafe(int cantidad) {
    int agregado = Math.min(cantidad, capacidadMaxima - this.cantidadActual);
    this.cantidadActual += agregado;
    return agregado;
}

	 */
}