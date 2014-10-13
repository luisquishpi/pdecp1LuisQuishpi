package vehiculos;

import upm.jbb.IO;

public class MenuVista {
    
    public MenuVista(MenuControlador menuControlador) {
        IO.in.addController(menuControlador);
    }

    public Vehiculo add(String nombreClase) {
        return (Vehiculo) IO.in.read(nombreClase, "Vehículo: ");
    }

    public void mostrarVehiculos(VehiculoGestor vehiculoGestor) {
        IO.out.clear();
        IO.out.print(vehiculoGestor.toString());
    }
}
