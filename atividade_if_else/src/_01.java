import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcao;
		double x;

		System.out.println("Menu de opções: ");
		System.out.println("1. Somar dois números.");
		System.out.println("2. Raiz quadrada de um número.");
		System.out.print("Digite a opção desejada: ");
		opcao = sc.nextInt();

		if (opcao == 1) {
			double y;

			System.out.print("Digite o primeiro número: ");
			x = sc.nextDouble();
			System.out.print("Digite o segundo número: ");
			y = sc.nextDouble();

			System.out.print("A soma dos dois números é: " + (x + y));

		} else if (opcao == 2) {
			System.out.print("Digite o número: ");
			x = sc.nextDouble();

			System.out.printf("A raiz quadrada do número é: %.2f", Math.sqrt(x));
		} else {
			System.out.print("Opção inválida");
		}

		sc.close();
		
	}

}
