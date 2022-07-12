import java.util.Scanner;

public class i {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int h1, h2; 
		double wageMin;
		
		System.out.print("Digite o número de horas trabalhadas: ");
		h1 = sc.nextInt();
		System.out.print("Digite o valor do salário mínimo: ");
		wageMin = sc.nextDouble();
		System.out.print("Digite o número de horas extras trabalhadas: ");
		h2 = sc.nextInt();
		
		System.out.printf("Seu salário é R$%.2f", (h1 * 0.125 * wageMin + h2 * 0.250 * wageMin));
		
		sc.close();
		
	}

}
