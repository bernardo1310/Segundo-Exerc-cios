import java.util.Scanner;
public class Ex13 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe seu salario:");
		Float sal = read.nextFloat();
		if (sal<=280) {
			System.out.println("SEU SALARIO R$"+sal+", COM PERSENTUAL "+(sal*0.2)+", COM REAJUSTE DE 20% = R$"+(sal+(sal*0.2)));
		} else if(sal>280 && sal<=700) {
			System.out.println("SEU SALARIO R$"+sal+", COM PERSENTUAL "+(sal*0.15)+", COM REAJUSTE DE 15% = R$"+(sal+(sal*0.15)));
		} else if(sal>700 && sal<=1500) {
			System.out.println("SEU SALARIO R$"+sal+", COM PERSENTUAL "+(sal*0.10)+", COM REAJUSTE DE 10% = R$"+(sal+(sal*0.10)));
		} else if(sal>1500) {
			System.out.println("SEU SALARIO R$"+sal+", COM PERSENTUAL "+(sal*0.05)+", COM REAJUSTE DE 20% = R$"+(sal+(sal*0.05)));
		}
		read.close();
	}

}
