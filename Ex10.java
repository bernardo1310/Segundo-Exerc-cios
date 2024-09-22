import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] num = new int[3];  // Declaração do array

		int maior = Integer.MIN_VALUE;  // Inicializa com o menor valor possível
		int meio = Integer.MIN_VALUE;   // Inicializa com o menor valor possível
		int menor = Integer.MAX_VALUE;  
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Informe o número:");
			num[i] = read.nextInt();

			if (i == 0) {  
				maior = num[i];
				meio = num[i];
				menor = num[i];
			} else {
				if (num[i] > maior) {
					menor = meio;
					meio = maior;
					maior = num[i];
				} else if (num[i] > meio) {
					menor = meio;
					meio = num[i];
				} else {
					menor = num[i];
				}
			}
		}
		System.out.println("Maior: " + maior + " Meio: " + meio + " Menor: " + menor);
		read.close();
	}
}
