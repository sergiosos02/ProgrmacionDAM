package Coches_App;

public class Puerta {

	    private boolean abierta;
	    private Ventana ventana;

	    public Puerta() {
	        ventana = new Ventana();
	    }

	    public void abrirPuerta() {
	        abierta = true;
	        System.out.println("Puerta abierta");
	    }

	    public void cerrarPuerta() {
	        abierta = false;
	        System.out.println("Puerta cerrada");
	    }

	    public Ventana getVentana() {
	        return ventana;
	    }
	}

