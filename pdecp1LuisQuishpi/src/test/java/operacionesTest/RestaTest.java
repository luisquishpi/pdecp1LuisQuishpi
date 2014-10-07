package operacionesTest;

import static org.junit.Assert.*;
import operaciones.Resta;

import org.junit.Test;

public class RestaTest {

    private Resta resta = new Resta(5, 1);
    @Test
    public void testCalcular() {
        assertEquals(4, resta.calcular(), 10e-5);
    }

    @Test
    public void testGetNombre() {
        assertEquals("-", resta.getNombre());
    }

    @Test
    public void testResta() {
        assertEquals(5, resta.getValor1());
        assertEquals(1, resta.getValor2());
    }

    @Test
    public void testGetValor1() {
        assertEquals(5, resta.getValor1());
    }

    @Test
    public void testGetValor2() {
        assertEquals(1, resta.getValor2());
    }

    @Test
    public void testToString() {
        assertEquals("[5-1]", resta.toString());
    }

}
