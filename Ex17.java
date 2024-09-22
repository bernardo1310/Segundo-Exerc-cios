import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Informe a primeira nota:");
        double nota1 = read.nextDouble();

        System.out.println("Informe a segunda nota:");
        double nota2 = read.nextDouble();

        double media = (nota1 + nota2) / 2;
        char conceito;

        if (media >= 9.0 && media <= 10.0) {
            conceito = 'A';
        } else if (media >= 7.5 && media < 9.0) {
            conceito = 'B';
        } else if (media >= 6.0 && media < 7.5) {
            conceito = 'C';
        } else if (media >= 4.0 && media < 6.0) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        System.out.println("Média: " + media + " Conceito: " + conceito);

        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

        read.close();
    }
}
