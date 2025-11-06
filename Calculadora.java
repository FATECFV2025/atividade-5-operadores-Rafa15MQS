public class Calculadora {

    public double somar(double a, double b) {
        return Operadores.somar(a, b);
    }

    public double subtrair(double a, double b) {
        return Operadores.subtrair(a, b);
    }

    public double multiplicar(double a, double b) {
        return Operadores.multiplicar(a, b);
    }

    public double dividir(double a, double b) {
        return Operadores.dividir(a, b);
    }

    public double atribuir(double a, double b) {
        return Operadores.atribuir(a, b);
    }

    public boolean and(boolean a, boolean b) {
        return Operadores.and(a, b);
    }

    public boolean or(boolean a, boolean b) {
        return Operadores.or(a, b);
    }

    public boolean not(boolean a) {
        return Operadores.not(a);
    }

    public boolean igual(double a, double b) {
        return Operadores.igual(a, b);
    }

    public boolean diferente(double a, double b) {
        return Operadores.diferente(a, b);
    }

    public boolean maiorQue(double a, double b) {
        return Operadores.maiorQue(a, b);
    }

    public boolean menorQue(double a, double b) {
        return Operadores.menorQue(a, b);
    }

    public boolean maiorOuIgual(double a, double b) {
        return Operadores.maiorOuIgual(a, b);
    }

    public boolean menorOuIgual(double a, double b) {
        return Operadores.menorOuIgual(a, b);
    }
}

