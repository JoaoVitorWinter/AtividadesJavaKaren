import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.print("Salário de Carlos: ");
		double wageC = sc.nextDouble();
		double wageJ = wageC / 3;
		
		while(wageJ < wageC) {
			wageC *= 1.02;
			wageJ *= 1.05;
			
			i++;
		}
		
		System.out.print("É necessário " + i + " meses para João alcançar Carlos.");
		
		sc.close();
		
	}

}
