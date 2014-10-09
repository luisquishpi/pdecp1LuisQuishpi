package vehiculosTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import vehiculos.Bicicletas;
import vehiculos.Vehiculo;

public class BicicletasTest {

    private Vehiculo vehiculo;

    @Before
    public void before() {
        vehiculo = new Bicicletas(1, "Description");
    }

    @Test
    public void testPrecio() {
        assertEquals(10, vehiculo.precio(4), 10e-5);
        assertEquals(14, vehiculo.precio(6), 10e-5);
    }

    @Test
    public void testBicicletas() {
        assertEquals(14, vehiculo.precio(6), 10e-5);
    }

    @Test
    public void testToString() {
        assertEquals("Bicicletas[Id: 1, Descripción: Description]", vehiculo.toString());
    }
}
