
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe o primeiro valor:");
		int num1 = read.nextInt();
		System.out.println("Informe o segundo");
		int num2 = read.nextInt();
		
		if(num1>num2) {
			System.out.println("o primeiro valor é maior: "+num1);
		}
		else if(num2>num1) {
			System.out.println("O segundo valor é maior:  "+num2);
		}
		else {
			System.out.println("Os valores são iguais");
		}
		read.close();
	}

}
