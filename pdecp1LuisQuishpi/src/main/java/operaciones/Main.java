package operaciones;

public class Main {

    public static void main(String[] args) {
        OperacionesColeccion operacionesColeccion = new OperacionesColeccion();
        operacionesColeccion.add(new Suma(3, 4));

        System.out.println("Total1:" + operacionesColeccion.total());
        operacionesColeccion.add(new Suma(5, 8));
        operacionesColeccion.add(new Resta(8, 4));
        operacionesColeccion.add(new Resta(9, 5));
        operacionesColeccion.add(new Producto(2, 7));

        System.out.println("Total2:" + operacionesColeccion.total());
    }

}
