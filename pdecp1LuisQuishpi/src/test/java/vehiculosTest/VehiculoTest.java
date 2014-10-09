package vehiculosTest;

import static org.junit.Assert.*;
import vehiculos.Vehiculo;

import org.junit.Test;

public abstract class VehiculoTest {

    public abstract Vehiculo vehiculo(int id, String descripcion);

    @Test
    public void testGetId() {
        Vehiculo vh = this.vehiculo(1, "Description");
        assertEquals(1, vh.getId());
    }

    @Test
    public void testGetDescripcion() {
        Vehiculo vh = this.vehiculo(1, "Desccription");
        assertEquals("Description", vh.getDescripcion());
    }

}
