import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		System.out.print("Digite o primeiro n�mero (n�o pode ser zero): ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		num2 = sc.nextDouble();
		
		System.out.printf("A divis�o do primeiro pelo segundo � %.2f", (num1 / num2));
		
		sc.close();
		
	}

}
