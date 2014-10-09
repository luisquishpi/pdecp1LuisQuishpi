package vehiculos;

public class Bicicletas extends Vehiculo {

    public Bicicletas(int id, String descripcion) {
        super(id, descripcion);
    }

    public double precio(int diasAlquilados) {
        double total = 0;
        for (int i = 1; i <= diasAlquilados; i++) {
            if (i >= 1 && i <= 2) {
                total += 3;
            } else if (i > 2) {
                total += 2;
            }
        }
        return total;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + "[Id: " + getId() + ", Descripción: "
                + getDescripcion() +"]";
    }
}
