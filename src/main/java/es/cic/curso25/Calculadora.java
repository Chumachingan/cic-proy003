package es.cic.curso25;

public class Calculadora extends Object {
    private double total = 0.0d;

    public double getTotal() {
        return total;
    }

    public void sumar(double valor) {
        total = total + valor;
    }

    public void restar(double valor) {
        total = total - valor;
    }

    public void multiplicar(double valor) {
        total = total * valor;
    }

    public void dividir(double valor) {
        if (valor == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        } else {
            total = total / valor;
        }
    }

    public void limpiar() {
        total = 0;
    }
}
