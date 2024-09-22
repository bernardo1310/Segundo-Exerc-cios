import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe o valor de A:");
        double a = read.nextDouble();
        
        if (a == 0) {
            System.out.println("A equação não é de segundo grau.");
        } else {
            System.out.println("Informe o valor de B:");
            double b = read.nextDouble();
            
            System.out.println("Informe o valor de C:");
            double c = read.nextDouble();
            
            double delta = b * b - 4 * a * c;
            
            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                double raizUnica = -b / (2 * a);
                System.out.println("A equação possui uma raiz real: " + raizUnica);
            } else {
                double raizQuadrada = 0;
                for (double i = 0; i * i <= delta; i += 0.00001) {
                    raizQuadrada = i;
                }
                double raiz1 = (-b + raizQuadrada) / (2 * a);
                double raiz2 = (-b - raizQuadrada) / (2 * a);
                System.out.println("A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
            }
        }
        read.close();
    }
}
