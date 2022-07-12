import java.util.Scanner;

public class m {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double wageMin, kWatts;
		
		System.out.print("Digite o valor do salário mínimo: ");
		wageMin = sc.nextDouble();
		System.out.print("Digite a quantidade de quilowatts: ");
		kWatts = sc.nextDouble();
		
			System.out.printf("O valor de cada quilowatt é %.2f", (wageMin * 0.2));
			System.out.printf("\nO valor a ser pago por essa residência é %.2f", (wageMin * 0.2 * kWatts));
			System.out.printf("\nO valor a ser pago com desconto de 15 por cento é %.2f", (wageMin * 0.17 * kWatts));
		
		sc.close();

	}

}
