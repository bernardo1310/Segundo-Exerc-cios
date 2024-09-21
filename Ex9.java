import java.util.Scanner;
public class Ex9 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Infore altura:");
		Float h = read.nextFloat();
		System.out.println("Informe peso:");
		int peso = read.nextInt();
		System.out.println("Informe seu sexo: M/F");
		char sexo = read.nextLine().charAt(0);
		
		if(sexo == 'M' || sexo =='m'){
			System.out.println("Altura:"+h+" Peso:"+peso+" sexo:"+sexo);
			double ideal = (72.7*h)-58;
			System.out.println("O peso ideal seria: "+ideal);
		} else {
			System.out.println("Altura:"+h+" Peso:"+peso+" sexo:"+sexo);
			double ideal = (62.1*h)-44.7;
			System.out.println("O peso ideal seria: "+ideal);
			
		}
		read.close();
	}

}
