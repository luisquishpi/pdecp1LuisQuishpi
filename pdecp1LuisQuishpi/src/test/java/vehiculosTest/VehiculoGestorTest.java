package vehiculosTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import vehiculos.Categorias;
import vehiculos.Coche;
import vehiculos.VehiculoGestor;

public class VehiculoGestorTest {

    VehiculoGestor vehiculoGestor;


    @Before
    public void init() {
        vehiculoGestor = new VehiculoGestor();
        vehiculoGestor.add(new Coche(1, "Description", Categorias.A.categoria));
    }

    @Test
    public void testAdd() {
        assertEquals(30, vehiculoGestor.precio(1, 3), 10e-5);
    }

    @Test
    public void testPrecio() {
        assertEquals(20, vehiculoGestor.precio(1, 2), 10e-5);
    }

    @Test
    public void testToString() {
        assertEquals("Coche[Id: 1, Descripción: Description, Categoría: A]\n", vehiculoGestor.toString());
    }

}
