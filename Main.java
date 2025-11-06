public class Main {

    public static void main(String[] args) {
        // Criando a instância da Calculadora
        Calculadora calc = new Calculadora();

        // Testando operações aritméticas
        System.out.println("Adição: " + calc.somar(10, 5));
        System.out.println("Subtração: " + calc.subtrair(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicar(10, 5));
        System.out.println("Divisão: " + calc.dividir(10, 5)); // Divisão por zero

        // Testando operadores de atribuição
        double a = 10;
        a = calc.atribuir(10, 5);
        System.out.println("Atribuição: " + a);

        // Testando operadores lógicos
        System.out.println("AND: " + calc.and(true, false));
        System.out.println("OR: " + calc.or(true, false));
        System.out.println("NOT: " + calc.not(true));

        // Testando operadores de comparação
        System.out.println("Igual: " + calc.igual(10, 5));
        System.out.println("Diferente: " + calc.diferente(10, 5));
        System.out.println("Maior que: " + calc.maiorQue(10, 5));
        System.out.println("Menor que: " + calc.menorQue(10, 5));
        System.out.println("Maior ou igual: " + calc.maiorOuIgual(10, 5));
        System.out.println("Menor ou igual: " + calc.menorOuIgual(10, 5));
    }
}
