import java.util.Scanner;

public class _20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ano, mes, dia;
		
		System.out.println("Digite sua idade com anos, meses e dias");
		System.out.println("Anos:");
		ano = sc.nextInt();
		System.out.println("Meses:");
		mes = sc.nextInt();
		System.out.println("Dias:");
		dia = sc.nextInt();
		
		System.out.println("O total de dias é: " + ((ano * 365) + (mes * 30) + dia));
		
	}

}
