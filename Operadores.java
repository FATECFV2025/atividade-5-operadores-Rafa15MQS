// Classe Operadores que define operações
public class Operadores {

    // Operações aritméticas básicas
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
         return a / b;
    }

    // Operadores de Atribuição
    public static double atribuir(double a, double b) {
        return b; // Atribui o valor de b a a
    }

    // Operadores Lógicos
    public static boolean and(boolean a, boolean b) {
        return a && b;
    }

    public static boolean or(boolean a, boolean b) {
        return a || b;
    }

    public static boolean not(boolean a) {
        return !a;
    }

    // Operadores de Comparação
    public static boolean igual(double a, double b) {
        return a == b;
    }

    public static boolean diferente(double a, double b) {
        return a != b;
    }

    public static boolean maiorQue(double a, double b) {
        return a > b;
    }

    public static boolean menorQue(double a, double b) {
        return a < b;
    }

    public static boolean maiorOuIgual(double a, double b) {
        return a >= b;
    }

    public static boolean menorOuIgual(double a, double b) {
        return a <= b;
    }
}
