import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num;
		
		while(true) {
			System.out.print("Digite um número: ");
			num = sc.nextDouble();
			
			if(num <= 0) {
				break;
			}
			
			System.out.println("Seu quadrado: " + Math.pow(num, 2));
			System.out.println("Seu cubo: " + Math.pow(num, 3));
			System.out.printf("Sua raiz quadrada: %.2f\n", Math.sqrt(num));
		}
		
		sc.close();
		
	}

}
