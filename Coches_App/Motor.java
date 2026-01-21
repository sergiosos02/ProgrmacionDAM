package Coches_App;

public class Motor {

	private boolean encendido;
	
	public void arrancar() {
        encendido = true;
        System.out.println("Motor arrancado");
    }

    public void apagar() {
        encendido = false;
        System.out.println("Motor apagado");
    }
    
    public boolean isEncendido() {
        return encendido;
    }
}
