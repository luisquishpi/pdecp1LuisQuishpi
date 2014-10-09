package operacionesTest;

import static org.junit.Assert.*;
import operaciones.Resta;

import org.junit.Before;
import org.junit.Test;

public class RestaTest {

    private Resta resta;
    @Before
    public void ini() {
        resta = new Resta(5, 1);
    }
    @Test
    public void testCalcular() {
        assertEquals(4, resta.calcular(), 10e-5);
    }

    @Test
    public void testGetNombre() {
        assertEquals("-", resta.getNombre());
    }

    @Test
    public void testToString() {
        assertEquals("[5-1]", resta.toString());
    }

}
