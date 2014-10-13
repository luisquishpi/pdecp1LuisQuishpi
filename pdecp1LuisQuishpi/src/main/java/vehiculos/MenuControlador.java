package vehiculos;

public class MenuControlador {

    private MenuVista menuVista;

    public MenuControlador() {
        this.menuVista = new MenuVista(this);
    }

    public void agregarCoches() {
        this.add(Coches.class.getName());
    }

    public void agregarBicicletas() {
        this.add(Bicicletas.class.getName());
    }

    public void agregarMotos() {
        this.add(Motos.class.getName());
    }

    public void verVehiculos() {
        VehiculoGestor vehiculoGestor = VehiculoGestor.getInstance();
        menuVista.mostrarVehiculos(vehiculoGestor);
    }

    private void add(String nombreClase) {
        Vehiculo vehiculo = this.menuVista.add(nombreClase);
        VehiculoGestor vehiculoGestor = VehiculoGestor.getInstance();
        vehiculoGestor.add(vehiculo);
    }

}
