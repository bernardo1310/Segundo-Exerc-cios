import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de morangos (kg): ");
        double kgMorangos = read.nextDouble();
        
        System.out.print("Informe a quantidade de maçãs (kg): ");
        double kgMacas = read.nextDouble();
        
        double precoMorangos = (kgMorangos <= 5) ? kgMorangos * 2.50 : kgMorangos * 2.20;
        double precoMacas = (kgMacas <= 5) ? kgMacas * 1.80 : kgMacas * 1.50;
        
        double valorTotal = precoMorangos + precoMacas;

        if (kgMorangos + kgMacas > 8 || valorTotal > 25.00) {
            valorTotal *= 0.90;
        }

        System.out.printf("Valor total a ser pago: R$ %.2f%n", valorTotal);
        
        read.close();
    }
}
