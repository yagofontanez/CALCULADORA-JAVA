public class CalculadoraCientifica extends CalculadoraBasica {
    public void potencia(double base, double expoente) {
        double resultado = Math.pow(base, expoente);
        System.out.println("Potência: " + resultado);
    }

    public void raizQuadrada(double numero) {
        if (numero >= 0) {
            double resultado = Math.sqrt(numero);
            System.out.println("Raiz Quadrada: " + resultado);
        } else {
            System.out.println("Não é possível calcular a raiz quadrada de um número negativo.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Insira o segundo número: ");
        double num2 = scanner.nextDouble();

        CalculadoraCientifica calculadora = new CalculadoraCientifica();

        calculadora.somar(num1, num2);
        calculadora.subtrair(num1, num2);
        calculadora.dividir(num1, num2);
        calculadora.multiplicar(num1, num2);
        calculadora.potencia(num1, num2);
        calculadora.raizQuadrada(num1);
    }
}
