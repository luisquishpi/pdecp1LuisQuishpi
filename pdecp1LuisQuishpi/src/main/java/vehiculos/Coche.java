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

    public double precio(int diasAlquilados) {
        double total = 0;
        for (int i = 1; i <= diasAlquilados; i++) {
            if (i >= 1 && i <= 3) {
                total += this.categoria.precio;
            } else if (i > 3 && i <= 7) {
                total += this.categoria.precio - (this.categoria.precio * 0.80);
            } else if (i > 7) {
                total += this.categoria.precio - (this.categoria.precio * 0.50);
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[Id: " + getId() + ", Descripción: "
                + getDescripcion() + ", Categoría: " + getCategoria() + "]";
    }

}
