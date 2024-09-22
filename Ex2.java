
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe o numero:");
		int num = read.nextInt();
		
		if(num>0) {
			System.out.println("POSITIVO NUM:"+num);
		}
		else if (num<0) {
			System.out.println("NEGATIVO NUM:"+num);
		}
		else {
			System.out.println("SEU NUMERO É ZERO");
		}
		
		read.close();
	}

}
