import java.util.Scanner;

public class _03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num1, num2;

		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextDouble();

		if (num1 > num2) {
			System.out.print("O maior é o numero " + num1);
		}

		if (num1 < num2) {
			System.out.print("O maior é o numero " + num2);
		}

		if (num1 == num2) {
			System.out.print("Os números são iguais!");
		}

		sc.close();

	}

}
