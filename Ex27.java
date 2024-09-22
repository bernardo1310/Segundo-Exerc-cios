import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe um número:");
        double numero = read.nextDouble();
        
        if (numero == Math.round(numero)) {
            System.out.println("O número " + numero + " é inteiro.");
        } else {
            System.out.println("O número " + numero + " é decimal.");
        }
        
        read.close();
    }
}
