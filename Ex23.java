import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe a idade do primeiro aluno:");
        int idade1 = read.nextInt();
        
        System.out.println("Informe a idade do segundo aluno:");
        int idade2 = read.nextInt();
        
        System.out.println("Informe a idade do terceiro aluno:");
        int idade3 = read.nextInt();
        
        double mediaIdade = (idade1 + idade2 + idade3) / 3.0;
        
        if (mediaIdade < 25) {
            System.out.println("Turma Jovem");
        } else if (mediaIdade >= 25 && mediaIdade <= 40) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }
        
        read.close();
    }
}
