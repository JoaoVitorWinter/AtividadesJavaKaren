import java.util.Scanner;

public class f {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double wageMin, wage;
		
		System.out.print("Quanto � o sal�rio m�nimo? ");
		wageMin = sc.nextDouble();
		System.out.print("Quanto � o seu sal�rio? ");
		wage = sc.nextDouble();
		
		System.out.printf("Voc� ganha %.2f sal�rios m�nimos", (wage / wageMin));
		
		sc.close();
		
	}

}
