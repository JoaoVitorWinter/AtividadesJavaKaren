import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcao;
		double x;

		System.out.println("Menu de op��es: ");
		System.out.println("1. Somar dois n�meros.");
		System.out.println("2. Raiz quadrada de um n�mero.");
		System.out.print("Digite a op��o desejada: ");
		opcao = sc.nextInt();

		if (opcao == 1) {
			double y;

			System.out.print("Digite o primeiro n�mero: ");
			x = sc.nextDouble();
			System.out.print("Digite o segundo n�mero: ");
			y = sc.nextDouble();

			System.out.print("A soma dos dois n�meros �: " + (x + y));

		} else if (opcao == 2) {
			System.out.print("Digite o n�mero: ");
			x = sc.nextDouble();

			System.out.printf("A raiz quadrada do n�mero �: %.2f", Math.sqrt(x));
		} else {
			System.out.print("Op��o inv�lida");
		}

		sc.close();
		
	}

}
