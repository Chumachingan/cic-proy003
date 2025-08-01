package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        // Preparo
        Calculadora cut = new Calculadora();
        // Ejecuto
        cut.sumar(5.6);
        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(5.6, valorActual, 0.000001);
        cut.sumar(3.4);
        valorActual = cut.getTotal();
        assertEquals(9, valorActual, 0.000001);
    }
    
    @Test
    public void testRestar() {
        // Preparo
        Calculadora cut = new Calculadora();
        // Ejecuto
        cut.sumar(10);
        cut.restar(3);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(7, valorActual, 0.000001);
    }

    @Test
    public void testMultiplicar() {
        // Preparo
        Calculadora cut = new Calculadora();
        // Ejecuto
        cut.sumar(10);
        cut.multiplicar(2);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(20, valorActual, 0.000001);
    }

    @Test
    public void testDividir() {
        // Preparo
        Calculadora cut = new Calculadora();
        // Ejecuto
        cut.sumar(20);
        cut.dividir(4);

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(5, valorActual, 0.000001);
    }
    @Test
    void testLimpiar() {
        // Preparo
        Calculadora cut = new Calculadora();
        // Ejecuto
        cut.sumar(10);
        cut.limpiar();

        // Verifico
        double valorActual = cut.getTotal();
        assertEquals(0, valorActual, 0.000001);
    }
}
