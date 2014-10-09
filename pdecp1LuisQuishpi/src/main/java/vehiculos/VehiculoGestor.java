package vehiculos;

import java.util.ArrayList;

public class VehiculoGestor {

    private static VehiculoGestor vehiculoGestor = null;

    private ArrayList<Vehiculo> vehiculoLista = new ArrayList<Vehiculo>();

    public static VehiculoGestor getInstance() {
        if (vehiculoGestor == null) {
            vehiculoGestor = new VehiculoGestor();
        }
        return vehiculoGestor;
    }

    public void add(Vehiculo vehiculo) {
        vehiculoLista.add(vehiculo);
    }

    public double precio(int id, int diasAlquilados) {
        for (Vehiculo vehiculo : vehiculoLista) {
            if (vehiculo.getId() == id) {
                return vehiculo.precio(diasAlquilados);
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        String texto = "";
        for (Vehiculo vehiculo : vehiculoLista) {
            texto += vehiculo.toString() + "\n";
        }
        return texto;
    }

}
