import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Insira o segundo número: ");
        double num2 = scanner.nextDouble();

        CalculadoraCientifica calculadora = new CalculadoraCientifica();

        System.out.println("Resultados da Calculadora Científica:");
        calculadora.somar(num1, num2);
        calculadora.subtrair(num1, num2);
        calculadora.dividir(num1, num2);
        calculadora.multiplicar(num1, num2);
        calculadora.potencia(num1, num2);
        calculadora.raizQuadrada(num1);
    }
}
