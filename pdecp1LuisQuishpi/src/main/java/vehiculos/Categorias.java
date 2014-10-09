package vehiculos;

public enum Categorias {
    A("A", 10), B("B", 15), C("C", 20);

    public int precio;

    public String categoria;

    Categorias(String categoria, int precio) {
        this.categoria = categoria;
        this.precio = precio;
    }
}
