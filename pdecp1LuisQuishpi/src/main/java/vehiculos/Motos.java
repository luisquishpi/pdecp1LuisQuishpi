package vehiculos;

public class Motos extends Vehiculo {

    public Motos(int id, String descripcion) {
        super(id, descripcion);
    }

    public double precio(int diasAlquilados) {
        double total = 0;
        if (diasAlquilados < 7) {
            total += diasAlquilados * 8;
        } else if (diasAlquilados >= 7) {
            total += diasAlquilados * 7;
        }
        return total;
    }
}
