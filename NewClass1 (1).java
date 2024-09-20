import java.util.Scanner;

public class Ex3 {
    public void sayHelloFromNewClass() {
        Scanner read = new Scanner(System.in);
        System.out.println("Informe seu sexo (M/F):");
        String sexo = read.nextLine().toUpperCase();

        if (sexo.equals("M")) {
            System.out.println("Masculino");
        } else if (sexo.equals("F")) {
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo inválido.");
        }
        read.close();
    }
    public static void main(String[] args) {
        NewClass1 obj = new NewClass1();
        obj.sayHelloFromNewClass();
    }
}
