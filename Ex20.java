import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe um ano:");
        int ano = read.nextInt();
      
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
        read.close();
    }
}
