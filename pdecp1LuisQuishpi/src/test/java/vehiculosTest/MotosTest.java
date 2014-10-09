package vehiculosTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import vehiculos.Motos;
import vehiculos.Vehiculo;

public class MotosTest {

    private Vehiculo vehiculo;

    @Before
    public void init() {
        vehiculo = new Motos(1, "Description");
    }

    @Test
    public void testPrecio() {
        assertEquals(40, vehiculo.precio(5), 10e-5);
        assertEquals(63, vehiculo.precio(9), 10e-5);
    }

    @Test
    public void testMotos() {
        assertEquals("Motos[Id: 1, Descripción :Description]", vehiculo.toString());
    }

}
