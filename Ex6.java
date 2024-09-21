import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe um numero para a conferencia:");
		int num = read.nextInt();
		if(num%2==0) {
			System.out.println("seu numero é par");
		}
		else {
			System.out.println("Seu numero é impar");
		}
		System.out.println(num+1);	
		read.close();
	}
}
