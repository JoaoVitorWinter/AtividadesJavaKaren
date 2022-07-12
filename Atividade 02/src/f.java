import java.util.Scanner;

public class f {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double wageMin, wage;
		
		System.out.print("Quanto é o salário mínimo? ");
		wageMin = sc.nextDouble();
		System.out.print("Quanto é o seu salário? ");
		wage = sc.nextDouble();
		
		System.out.printf("Você ganha %.2f salários mínimos", (wage / wageMin));
		
		sc.close();
		
	}

}
