import java.util.Scanner;
public class Ex25 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Informe o valor do saque (mínimo R$ 10 e máximo R$ 600):");
		int saque = read.nextInt();

		if (saque < 10 || saque > 600) {
			System.out.println("Valor inválido. O valor deve estar entre R$ 10 e R$ 600.");
		} else {
			int[] notas = {100, 50, 10, 5, 1};
			int[] quantidade = {0, 0, 0, 0, 0};

			for (int i = 0; i < 5; i++) {
				if (saque >= notas[i]) {
					quantidade[i] = saque / notas[i];
					saque = saque % notas[i];
				}
			}

			System.out.println("Notas fornecidas:");
			for (int i = 0; i < 5; i++) {
				if (quantidade[i] > 0) {
					System.out.println(quantidade[i] + " notas de R$ " + notas[i]);
				}
			}
		}
		read.close();
	}
}
