import java.util.Scanner;
public class Ex8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a nota 1:");
		Float nota1 = scanner.nextFloat();
		System.out.println("Informe a nota 2:");
		Float nota2 = scanner.nextFloat();
		Float media = (nota1+nota2)/2;
		if(media>=7) {
			System.out.println("Sua média foi "+media+" e você foi aprovado");
		} else {
			System.out.println("Sua média foi"+media+" e você está reprovado");
		}
		scanner.close();
	}
}
