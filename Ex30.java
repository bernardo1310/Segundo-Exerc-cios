import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Informe o tipo de combustível (A - Álcool / G - Gasolina): ");
        char tipoCombustivel = read.next().toUpperCase().charAt(0);
        
        System.out.print("Informe o número de litros vendidos: ");
        double litros = read.nextDouble();
        
        double precoPorLitro = 0;
        double desconto = 0;

        if (tipoCombustivel == 'A') {
            precoPorLitro = 1.90;
            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipoCombustivel == 'G') {
            precoPorLitro = 2.50;
            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            read.close();
            return;
        }

        double valorTotal = litros * precoPorLitro;
        double valorDesconto = valorTotal * desconto;
        double valorFinal = valorTotal - valorDesconto;

        System.out.printf("Valor total sem desconto: R$ %.2f%n", valorTotal);
        System.out.printf("Desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor a ser pago: R$ %.2f%n", valorFinal);
        
        read.close();
    }
}
