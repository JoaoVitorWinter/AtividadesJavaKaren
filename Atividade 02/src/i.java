import java.util.Scanner;

public class i {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int h1, h2; 
		double wageMin;
		
		System.out.print("Digite o n�mero de horas trabalhadas: ");
		h1 = sc.nextInt();
		System.out.print("Digite o valor do sal�rio m�nimo: ");
		wageMin = sc.nextDouble();
		System.out.print("Digite o n�mero de horas extras trabalhadas: ");
		h2 = sc.nextInt();
		
		System.out.printf("Seu sal�rio � R$%.2f", (h1 * 0.125 * wageMin + h2 * 0.250 * wageMin));
		
		sc.close();
		
	}

}
