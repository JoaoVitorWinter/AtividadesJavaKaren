import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3;
		
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextDouble();
		System.out.print("Digite o terceiro número: ");
		num3 = sc.nextDouble();
		
		System.out.printf("A multiplicação dos três números é %.2f", (num1 * num2 * num3));
		
		sc.close();
		
	}

}
