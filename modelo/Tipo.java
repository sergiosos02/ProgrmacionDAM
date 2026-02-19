package modelo;

public enum Tipo {
    X("X"),
    O("O"),
    BLANCO("");

    private String nombre;

    Tipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
