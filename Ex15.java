import java.util.Scanner;
public class Ex15 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Informe o preço de custo do produto:");
		double preco = read.nextDouble();

		System.out.println("Informe o código de origem:");
		int codigo = read.nextInt();

		String procedencia;

		if (codigo == 1) {
			procedencia = "Sul";
		} else if (codigo == 2) {
			procedencia = "Norte";
		} else if (codigo == 3) {
			procedencia = "Leste";
		} else if (codigo == 4) {
			procedencia = "Oeste";
		} else if (codigo == 5 || codigo == 6) {
			procedencia = "Nordeste";
		} else if (codigo == 7 || codigo == 8) {
			procedencia = "Centro-oeste";
		} else {
			procedencia = "Importado";
		}

		System.out.println("Preço: " + preco + " Procedência: " + procedencia);

		read.close();
	}
}