package vehiculos;

public class MenuControlador {
    private MenuVista menuVista;

    public MenuControlador() {
        this.menuVista = new MenuVista(this);
    }

    public void addMotos() {
        this.agregar(Motos.class.getName());
    }

    public void addBicicletas() {
        this.agregar(Bicicletas.class.getName());
    }

    public void addCoches() {
        this.agregar(Coches.class.getName());
    }

    public void VerVehiculos() {
        VehiculoGestor vehiculoGestor = VehiculoGestor.getInstance();
        menuVista.mostrarVehiculos(vehiculoGestor);
    }

    private void agregar(String name) {
        Vehiculo vehiculo = this.menuVista.añadir(name);
        VehiculoGestor vehiculoGestor = VehiculoGestor.getInstance();
        vehiculoGestor.add(vehiculo);
    }

}
