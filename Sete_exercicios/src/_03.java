import java.util.Scanner;

public class _03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num1, num2;

		System.out.print("Digite o primeiro n�mero: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		num2 = sc.nextDouble();

		if (num1 > num2) {
			System.out.print("O maior � o numero " + num1);
		}

		if (num1 < num2) {
			System.out.print("O maior � o numero " + num2);
		}

		if (num1 == num2) {
			System.out.print("Os n�meros s�o iguais!");
		}

		sc.close();

	}

}
