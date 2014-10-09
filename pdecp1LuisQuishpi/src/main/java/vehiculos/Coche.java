package vehiculos;

public class Coche extends Vehiculo {
    private Categorias categoria;

    public Coche(int id, String descripcion, String categoria) {
        super(id, descripcion);
        this.categoria = Categorias.valueOf(categoria);
    }

    public Categorias getCategoria() {
        return this.categoria;
    }


}
