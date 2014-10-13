package vehiculosTest;

import static org.junit.Assert.*;

import org.junit.Test;

import vehiculos.Categorias;
import vehiculos.Coches;
import vehiculos.Vehiculo;

import org.junit.Before;

public class CocheTest {
    private Vehiculo vehiculo;

    @Before
    public void before() {
        vehiculo = new Coches(1, "Description", Categorias.A.categoria);
    }

    @Test
    public void testPrecio() {
        assertEquals(20.00, vehiculo.precio(2), 10e-5);
        assertEquals(30.00, vehiculo.precio(3), 10e-5);
    }

    @Test
    public void testToString() {
        assertEquals("Coches[Id: 1, Descripción: Description, Categoría: A]", vehiculo.toString());
    }

    @Test
    public void testCoche() {
        assertEquals(30.00, vehiculo.precio(3), 10e-5);
    }

    @Test
    public void testGetCategoria() {
        assertEquals(Categorias.A, ((Coches) vehiculo).getCategoria());
    }

}
