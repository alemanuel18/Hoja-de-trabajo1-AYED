/**
 * Universidad del Valle de Guatemala
 * Autor: Norman Aguirre Lepe
 * Fecha: 20 de enero de 2025
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LicuadoraTest {

    @Test
    void testEncenderLicuadora() {
        // Crear una licuadora apagada y vacía
        Licuadora licuadora = new Licuadora(false, true, 0);

        // Encender la licuadora
        licuadora.encender();

        // Verificar que está encendida y la velocidad se ha inicializado
        assertEquals(1, licuadora.getVelocidad(), "La licuadora debería encenderse con velocidad 1.");
    }

    @Test
    void testAumentarVelocidad() {
        // Crear una licuadora con velocidad inicial 0
        Licuadora licuadora = new Licuadora(true, true, 0);

        // Aumentar la velocidad
        licuadora.aumentarVelocidad();

        // Verificar que la velocidad es 1
        assertEquals(1, licuadora.getVelocidad(), "La velocidad debería ser 1 después de aumentar.");

        // Aumentar velocidad varias veces hasta llegar al límite
        for (int i = 0; i < 10; i++) {
            licuadora.aumentarVelocidad();
        }

        // Verificar que la velocidad vuelve a 0 al pasarse del límite
        assertEquals(0, licuadora.getVelocidad(), "La velocidad debería reiniciarse a 0 al sobrepasar el límite.");
    }

    @Test
    void testConsultarLlenado() {
        // Crear una licuadora vacía
        Licuadora licuadora = new Licuadora(false, false, 0);

        // Llenar la licuadora
        licuadora.llenar();

        // Verificar que está llena
        assertTrue(licuadora.consultarLlenado(), "La licuadora debería estar llena después de llenarla.");
    }
}
