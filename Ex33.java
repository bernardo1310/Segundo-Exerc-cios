import java.util.Scanner;
public class Ex33 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char[] gabarito = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e'};
        char[] respostas = new char[10];

        System.out.println("Informe suas respostas (a, b, c, d ou e) para as 10 questões:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Q" + (i + 1) + ": ");
            respostas[i] = read.next().toLowerCase().charAt(0);
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < 10; i++) {
            if (respostas[i] == gabarito[i]) {
                System.out.printf("Q%d: %c : Correto%n", (i + 1), respostas[i]);
            } else {
                System.out.printf("Q%d: %c : Errada, resposta correta (%c)%n", (i + 1), respostas[i], gabarito[i]);
            }
        }
        read.close();
    }
}
