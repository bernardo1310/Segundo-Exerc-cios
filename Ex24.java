import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota:");
        double nota1 = read.nextDouble();
        
        System.out.println("Informe a segunda nota:");
        double nota2 = read.nextDouble();
        
        System.out.println("Informe a terceira nota:");
        double nota3 = read.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        if (media == 10) {
            System.out.println("Aprovado com Distinção. Média: " + media);
        } else if (media >= 7) {
            System.out.println("Aprovado. Média: " + media);
        } else {
            System.out.println("Reprovado. Média: " + media);
        }
        
        read.close();
    }
}
