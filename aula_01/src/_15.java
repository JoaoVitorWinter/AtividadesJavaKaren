import java.util.Scanner;

public class _15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.println("Digite um n�mero: ");
		num1 = sc.nextDouble();
		
		System.out.println("Digite outro: ");
		num2 = sc.nextDouble();
		
		System.out.println("M�dia: " + ((num1 + num2) / 2));
	}

}
