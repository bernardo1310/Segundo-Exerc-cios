import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro:");
        int numero = read.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
        read.close();
    }
}
