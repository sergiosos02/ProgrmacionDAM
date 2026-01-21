package Coches_App;

public class Ventana {
	   private boolean abierta;

	    public void abrir() {
	        abierta = true;
	        System.out.println("Ventana abierta");
	    }

	    public void cerrar() {
	        abierta = false;
	        System.out.println("Ventana cerrada");
	    }

	    public boolean isAbierta() {
	        return abierta;
	    }
}
