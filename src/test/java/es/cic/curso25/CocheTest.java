package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CocheTest {

    private Coche cut;

    @BeforeEach
    void setUp() {
        cut = new Coche();
    }

    @Test
    void testAcelerar() {
        cut.acelerar(34);
        int velocidadFinal = cut.acelerar(23);
        assertEquals(57, velocidadFinal);
    }

    @Test
    void testFrenar() {
        cut.acelerar(50);
        int velocidadFinal = cut.frenar(20);
        assertEquals(30, velocidadFinal);
    }

    @Test
    void testGetConsumo() {
        cut.acelerar(50);
        double consumo = cut.getConsumo();
        assertEquals(2.15, consumo, 0.00001);
    }

    @Test
    void testGetVelocidad() {
        cut.acelerar(50);
        int velocidad = cut.getVelocidad();
        assertEquals(50, velocidad);
    }
}
