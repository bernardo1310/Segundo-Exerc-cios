import java.util.Scanner;
public class Ex29 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Responda às seguintes perguntas com 's' para sim e 'n' para não:");

        System.out.print("Telefonou para a vítima? ");
        String pergunta1 = read.next();
        
        System.out.print("Esteve no local do crime? ");
        String pergunta2 = read.next();
        
        System.out.print("Mora perto da vítima? ");
        String pergunta3 = read.next();
        
        System.out.print("Devia para a vítima? ");
        String pergunta4 = read.next();
        
        System.out.print("Já trabalhou com a vítima? ");
        String pergunta5 = read.next();

        int contador = 0;

        if (pergunta1 == "s") contador++;
        if (pergunta2 == "s") contador++;
        if (pergunta3 == "s") contador++;
        if (pergunta4 == "s") contador++;
        if (pergunta5 == "s") contador++;

        if (contador == 2) {
            System.out.println("Suspeita.");
        } else if (contador >= 3 && contador <= 4) {
            System.out.println("Culpado.");
        } else if (contador == 5) {
            System.out.println("Culpado. (Caso grave)");
        } else {
            System.out.println("Inocente.");
        }
        read.close();
    }
}
