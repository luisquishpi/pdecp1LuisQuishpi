package operacionesTest;

import static org.junit.Assert.*;

import org.junit.Test;
import operaciones.Suma;

public class SumaTest {

    private Suma suma = new Suma(2, 3);

    @Test
    public void testCalcular() {
        assertEquals(5, suma.calcular(), 10e-5);
    }

    @Test
    public void testGetNombre() {
        assertEquals("+", suma.getNombre());
    }
}
