package vehiculos;

public abstract class Vehiculo {
    
    private String descripcion;

    private int id;

    public Vehiculo(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public int getId() {
        return this.id;
    }

    public abstract double precio(int dia);

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[Id: " + getId() + ", Descripción :"
                + getDescripcion() + "]";
    }

}
