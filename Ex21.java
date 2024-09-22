import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe uma data no formato dd/mm/aaaa:");
        String data = read.nextLine();
        
        if (data.length() != 10 || data.charAt(2) != '/' || data.charAt(5) != '/') {
            System.out.println("Data inválida.");
        } else {
            String diaStr = data.substring(0, 2);
            String mesStr = data.substring(3, 5);
            String anoStr = data.substring(6, 10);
            
            int dia = (diaStr.charAt(0) - '0') * 10 + (diaStr.charAt(1) - '0');
            int mes = (mesStr.charAt(0) - '0') * 10 + (mesStr.charAt(1) - '0');
            int ano = (anoStr.charAt(0) - '0') * 1000 + (anoStr.charAt(1) - '0') * 100 + (anoStr.charAt(2) - '0') * 10 + (anoStr.charAt(3) - '0');
            
            boolean dataValida = true;

            if (mes < 1 || mes > 12) {
                dataValida = false;
            } else {
                if (dia < 1 || dia > 31) {
                    dataValida = false;
                } else if (mes == 2) {
                    if (ano % 4 == 0) {
                        if (dia > 29) {
                            dataValida = false;
                        }
                    } else {
                        if (dia > 28) {
                            dataValida = false;
                        }
                    }
                } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                    dataValida = false;
                }
            }

            if (dataValida) {
                System.out.println("Data válida.");
            } else {
                System.out.println("Data inválida.");
            }
        } 
        read.close();
    }
}
