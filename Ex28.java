import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = read.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = read.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        int operacao = read.nextInt();

        double resultado = 0;

        if (operacao == 1) {
            resultado = num1 + num2;
        } else if (operacao == 2) {
            resultado = num1 - num2;
        } else if (operacao == 3) {
            resultado = num1 * num2;
        } else if (operacao == 4) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: Divisão por zero.");
                read.close();
                return;
            }
        } else {
            System.out.println("Operação inválida.");
            read.close();
            return;
        }

        System.out.println("Resultado: " + resultado);

        if (resultado % 2 == 0) {
            System.out.println("O resultado é par.");
        } else {
            System.out.println("O resultado é ímpar.");
        }

        if (resultado > 0) {
            System.out.println("O resultado é positivo.");
        } else if (resultado < 0) {
            System.out.println("O resultado é negativo.");
        } else {
            System.out.println("O resultado é zero.");
        }

        if (resultado == (int) resultado) {
            System.out.println("O resultado é inteiro.");
        } else {
            System.out.println("O resultado é decimal.");
        }

        read.close();
    }
}
