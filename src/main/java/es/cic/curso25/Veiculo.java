package es.cic.curso25;

public class Veiculo {

    protected int velocidad = 0;
    protected Calculadora calculadora;
    private final double CONSUMO_INSTANTANIO = 4.3;

    public Veiculo() {
        this.calculadora = new Calculadora();
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
}
