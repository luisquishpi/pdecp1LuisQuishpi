package operacionesTest;

import static org.junit.Assert.*;
import operaciones.Producto;

import org.junit.Before;
import org.junit.Test;

public class ProductoTest {

    private Producto producto;
    @Before
    public void ini() {
        producto = new Producto(6, 2);
    }
    @Test
    public void testCalcular() {
        assertEquals(12, producto.calcular());
    }

    @Test
    public void testGetNombre() {
        assertEquals("*", producto.getNombre());
    }

    @Test
    public void testProducto() {
        assertEquals(12, producto.calcular());
    }

    @Test
    public void testToString() {
        assertEquals("[6*2]", producto.toString());
    }

}
