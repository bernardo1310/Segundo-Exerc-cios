import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Tipos de carne disponíveis:");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Informe o tipo de carne (1, 2 ou 3): ");
        int tipoCarne = read.nextInt();
        
        System.out.print("Informe a quantidade de carne (kg): ");
        double quantidade = read.nextDouble();
        
        double precoPorKg = 0;

        if (tipoCarne == 1) {
            precoPorKg = (quantidade <= 5) ? 4.90 : 5.80;
        } else if (tipoCarne == 2) {
            precoPorKg = (quantidade <= 5) ? 5.90 : 6.80;
        } else if (tipoCarne == 3) {
            precoPorKg = (quantidade <= 5) ? 6.90 : 7.80;
        } else {
            System.out.println("Tipo de carne inválido.");
            read.close();
            return;
        }

        double valorTotal = quantidade * precoPorKg;

        System.out.print("Forma de pagamento (1 - Cartão Tabajara / 2 - Outro): ");
        int formaPagamento = read.nextInt();
        
        double desconto = 0;
        if (formaPagamento == 1) {
            desconto = valorTotal * 0.05;
            valorTotal -= desconto;
        }

        System.out.printf("Cupom Fiscal:%n");
        System.out.printf("Tipo de carne: %d%n", tipoCarne);
        System.out.printf("Quantidade: %.2f kg%n", quantidade);
        System.out.printf("Preço total: R$ %.2f%n", quantidade * precoPorKg);
        System.out.printf("Tipo de pagamento: %s%n", formaPagamento == 1 ? "Cartão Tabajara" : "Outro");
        System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor a pagar: R$ %.2f%n", valorTotal);
        
        read.close();
    }
}
