package Coches_App;

public class Rueda {

	private boolean inflada;
	
	public void inflar() {
        inflada = true;
        System.out.println("Motor arrancado");
    }

    public void desinflar() {
        inflada = false;
        System.out.println("Motor apagado");
    }
    
    public boolean isInflada() {
        return inflada;
    }
}
