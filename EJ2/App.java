package EJ2;

public class App {
    public static void main(String[] args) {
        Vertice p1 = new Vertice(0.0, 0.0);
        Vertice p2 = new Vertice(1.0, 1.0);

        Linea linea = new Linea(p1, p2);
        System.out.println(linea); // [(0.0,0.0),(1.0,1.0)]

        linea.MueveDerecha(2);
        linea.MueveArriba(1);

        System.out.println(linea); // [(2.0,1.0),(3.0,2.0)]
    }
}
