import java.util.Scanner;
public class Ex22 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro menor que 1000:");
        int numero = read.nextInt();
        
        if (numero < 0 || numero >= 1000) {
            System.out.println("Número inválido. Deve ser menor que 1000.");
        } else {
            int centenas = numero / 100;
            int dezenas = (numero % 100) / 10;
            int unidades = numero % 10;
            
            System.out.println("Centenas: " + centenas);
            System.out.println("Dezenas: " + dezenas);
            System.out.println("Unidades: " + unidades);
        }    
        read.close();
    }
}
