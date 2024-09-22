import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota:");
        double nota1 = read.nextDouble();
        
        System.out.println("Informe a segunda nota:");
        double nota2 = read.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        if (media >= 0 && media < 3) {
            System.out.println("Reprovado. Média: " + media);
        } else if (media >= 3 && media < 7) {
            System.out.println("Em Exame. Média: " + media);
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado. Média: " + media);
        } else {
            System.out.println("Média inválida.");
        }
        
        read.close();
    }
}
