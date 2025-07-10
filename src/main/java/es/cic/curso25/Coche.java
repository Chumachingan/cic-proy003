package es.cic.curso25;

import es.cic.curso25.Calculadora;

public class Coche {

    private Calculadora calculadora;

    public Coche() {
        this.calculadora = new Calculadora();
    }

    private final double CONSUMO_INSTANTANIO = 4.3;
    private int velocidad = 0;

    public int getVelocidad() {
        return velocidad;

    }

    public double getConsumo() {
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.dividir(100.0);
        this.calculadora.multiplicar(CONSUMO_INSTANTANIO);

        return calculadora.getTotal();
    }

    public int acelerar(int incrementoDeVelocidad) {
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.sumar(incrementoDeVelocidad);

        this.velocidad = (int) Math.round(calculadora.getTotal());
        return this.velocidad;

    }

    public int frenar(int decrementoDeVelocidad) {
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.restar(decrementoDeVelocidad);

        this.velocidad = (int) Math.round(calculadora.getTotal());
        return this.velocidad;

    }
}
