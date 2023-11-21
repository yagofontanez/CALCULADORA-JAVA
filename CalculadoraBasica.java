import java.util.Scanner;

public class CalculadoraBasica extends Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Insira o segundo número: ");
        double num2 = scanner.nextDouble();

        CalculadoraBasica calculadora = new CalculadoraBasica();
        calculadora.somar(num1, num2);
        calculadora.subtrair(num1, num2);
        calculadora.dividir(num1, num2);
        calculadora.multiplicar(num1, num2);
    }

    public void somar(double num1, double num2) {
        double soma = num1 + num2;
        System.out.println("Soma: " + soma);
    }

    public void subtrair(double num1, double num2) {
        double subtracao = num1 - num2;
        System.out.println("Subtração: " + subtracao);
    }

    public void dividir(double num1, double num2) {
        if (num2 != 0) {
            double divisao = num1 / num2;
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Operação com 0 não permitida");
        }
    }

    public void multiplicar(double num1, double num2) {
        double multiplicacao = num1 * num2;
        System.out.println("Multiplicação: " + multiplicacao);
    }
}
