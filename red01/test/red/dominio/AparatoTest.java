package red.dominio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AparatoTest {

    @Test
    void testEncender() {
        Aparato aparato = new Aparato();
        aparato.encender();
        assertTrue(aparato.getEncendido());
    }

    @Test
    void testApagar() {
        Aparato aparato = new Aparato();
        aparato.apagar();
        assertFalse(aparato.getEncendido());
    }
}