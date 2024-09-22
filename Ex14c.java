import java.util.Scanner;
public class Ex14c {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int dia = read.nextInt();
		if(dia<0 && dia>7) {
			System.out.println("Valor invalido");
		} else if(dia==1) {
			System.out.println("DOMINGO");
		} else if(dia==2) {
			System.out.println("SEGUNDA");
		} else if(dia==3) {
			System.out.println("TERÇA");
		} else if(dia==4) {
			System.out.println("QUARTA");
		} else if(dia==5) {
			System.out.println("QUINTA");
		} else if(dia==6) {
			System.out.println("SEXTA");
		} else if(dia==7) {
			System.out.println("SABADO");
		}
		read.close();
	}
}
