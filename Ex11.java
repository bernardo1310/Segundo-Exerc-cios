import java.util.Scanner;
public class Ex11 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("em que turno você estuda: Matutino ou V-Vespertino ou N- Noturno.");
		char turn = read.next().charAt(0);

		if(turn == 'M') {
			System.out.println("Bom dia");
		} else if(turn == 'V') {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
		read.close();
	}

}
