package vehiculosTest;

import static org.junit.Assert.*;
import vehiculos.Vehiculo;

import org.junit.Test;

public abstract class VehiculoTest {

    public abstract Vehiculo vehiculo(int id, String descripcion);

    @Test
    public void testGetId() {
        Vehiculo vehic = this.vehiculo(1, "Description");
        assertEquals(1, vehic.getId());
    }

    @Test
    public void testGetDescripcion() {
        Vehiculo vehic = this.vehiculo(1, "Desccription");
        assertEquals("Description", vehic.getDescripcion());
    }

}
