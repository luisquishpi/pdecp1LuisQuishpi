package vehiculos;

import upm.jbb.IO;

public class MenuVista {
    public MenuVista(MenuControlador menuControlador) {
        IO.in.addController(menuControlador, false);
    }

    public Vehiculo añadir(String name) {
        return (Vehiculo) IO.in.read(name, "Valores de vehiculo: ");
    }

    public void mostrarVehiculos(VehiculoGestor vehiculoGestor) {
        IO.out.clear();
        IO.out.print(vehiculoGestor.toString());
    }
}
