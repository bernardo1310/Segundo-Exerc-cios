import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe o primeiro lado do triângulo:");
        double lado1 = read.nextDouble();
        
        System.out.println("Informe o segundo lado do triângulo:");
        double lado2 = read.nextDouble();
        
        System.out.println("Informe o terceiro lado do triângulo:");
        double lado3 = read.nextDouble();
        
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero: todos os lados iguais.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles: dois lados iguais.");
            } else {
                System.out.println("Triângulo Escaleno: todos os lados diferentes.");
            }
        } else {
            System.out.println("Os valores fornecidos não formam um triângulo.");
        }
        
        read.close();
    }
}
