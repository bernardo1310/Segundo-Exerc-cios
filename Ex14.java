import java.util.Scanner;
public class Ex14 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("valor da sua hora:");
		Float sal = read.nextFloat();
		System.out.println("quantidade de horas trabalhadas no mês:");
		int hora = read.nextInt();
		Float salBruto = hora*sal;
		if(salBruto<900) {
			System.out.println("R$"+salBruto);
			System.out.println("INSS 20% = "+(salBruto*0.10));
			System.out.println("FGTS 11% = "+(salBruto*0.11));
			System.out.println("total de descontos = "+(salBruto*0.10+salBruto*0.11));
			System.out.println("Salario Liquido R$"+((salBruto*0.10+salBruto*0.11)-salBruto));
		} else if(salBruto<=1500) {
			System.out.println("R$"+salBruto);
			System.out.println("IR de 5% = "+salBruto*0.05);
			System.out.println("INSS 20% = "+(salBruto*0.10));
			System.out.println("FGTS 11% = "+(salBruto*0.11));
			System.out.println("total de descontos = "+(salBruto*0.10+salBruto*0.11));
			System.out.println("Salario Liquido R$"+((salBruto*0.10+salBruto*0.11+salBruto*0.05)-salBruto));
		} else if(salBruto<2500) { 
			System.out.println("R$"+salBruto);
			System.out.println("IR de 10% = "+salBruto*0.10);
			System.out.println("INSS 20% = "+(salBruto*0.10));
			System.out.println("FGTS 11% = "+(salBruto*0.11));
			System.out.println("total de descontos = "+(salBruto*0.10+salBruto*0.11));
			System.out.println("Salario Liquido R$"+((salBruto*0.10+salBruto*0.11+salBruto*0.10)-salBruto));
		}

		read.close();
	}
}
