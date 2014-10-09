package vehiculos;

import java.util.ArrayList;

public class VehiculoGestor {

    private static VehiculoGestor vehiculoGestor = null;

    protected ArrayList<Vehiculo> vehiculoLista = new ArrayList<Vehiculo>();

    public static VehiculoGestor getInstance() {
        if (vehiculoGestor == null) {
            vehiculoGestor = new VehiculoGestor();
        }
        return vehiculoGestor;
    }

    public void add(Vehiculo vehiculo) {
        vehiculoLista.add(vehiculo);
    }

}
