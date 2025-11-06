public class Main {

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();

        System.out.println("Adição: " + calc.somar(10, 5));
        System.out.println("Subtração: " + calc.subtrair(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicar(10, 5));
        System.out.println("Divisão: " + calc.dividir(10, 5)); 

        double a = 10;
        a = calc.atribuir(10, 5);
        System.out.println("Atribuição: " + a);

        System.out.println("AND: " + calc.and(true, false));
        System.out.println("OR: " + calc.or(true, false));
        System.out.println("NOT: " + calc.not(true));

        System.out.println("Igual: " + calc.igual(10, 5));
        System.out.println("Diferente: " + calc.diferente(10, 5));
        System.out.println("Maior que: " + calc.maiorQue(10, 5));
        System.out.println("Menor que: " + calc.menorQue(10, 5));
        System.out.println("Maior ou igual: " + calc.maiorOuIgual(10, 5));
        System.out.println("Menor ou igual: " + calc.menorOuIgual(10, 5));
    }
}


