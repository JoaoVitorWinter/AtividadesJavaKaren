import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		num2 = sc.nextDouble();
		System.out.print("Digite o terceiro n�mero: ");
		num3 = sc.nextDouble();
		
		System.out.printf("A multiplica��o dos tr�s n�meros � %.2f", (num1 * num2 * num3));
		
		sc.close();
		
	}

}
