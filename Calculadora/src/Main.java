import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int escolha, quantidade;
		double resultado = 0;

		System.out.println("Menu: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
		System.out.println("5 - Potencia��o");
		System.out.println("6 - Raiz quadrada");
		System.out.println("7 - Porcentagem");
		System.out.print("\nEscolha um:");
		escolha = sc.nextInt();

		System.out.print("\nQuantidade (1-5): ");
		quantidade = sc.nextInt();

		if (quantidade > 5) {
			quantidade = 5;
		} else if (quantidade < 1) {
			quantidade = 1;
		}

		switch (escolha) {
		case 1:
			while (true) {
				System.out.print("Digite um n�mero para somar: ");
				resultado += sc.nextDouble();

				quantidade--;

				if (quantidade == 0) {
					break;
				}
			}

			break;
		case 2:
			if (quantidade == 1) {
				quantidade = 2;
			}

			System.out.print("Digite um n�mero: ");
			resultado += sc.nextDouble();

			while (true) {
				System.out.print("Digite um n�mero para subtrair: ");
				resultado -= sc.nextDouble();

				quantidade--;

				if (quantidade == 1) {
					break;
				}
			}
			break;
		case 3:
			if (quantidade == 1) {
				quantidade = 2;
			}

			System.out.print("Digite um n�mero: ");
			resultado += sc.nextDouble();

			while (true) {
				System.out.print("Digite um n�mero para multiplicar: ");
				resultado *= sc.nextDouble();

				quantidade--;

				if (quantidade == 1) {
					break;
				}
			}
			break;
		case 4:
			if (quantidade == 1) {
				quantidade = 2;
			}

			System.out.print("Digite um n�mero: ");
			resultado += sc.nextDouble();

			while (true) {
				System.out.print("Digite um n�mero para dividir: ");
				resultado /= sc.nextDouble();

				quantidade--;

				if (quantidade == 1) {
					break;
				}
			}
			break;
		case 5:
			System.out.print("Digite um n�mero para elevar pela quantidade que voc� digitou: ");
			resultado += Math.pow(sc.nextDouble(), quantidade);
			break;
		case 6:
			System.out.print("Digite um n�mero para calcular a raiz quadrada: ");
			resultado += Math.sqrt(sc.nextDouble());
			break;
		case 7:
			System.out.print("Digite um n�mero para ser a porcentagem do total: ");
			resultado += sc.nextDouble();

			System.out.print("Digite o total: ");
			resultado = resultado / sc.nextDouble() * 100;
			break;
		default:
			System.out.print("Escolheu errado!");
		}

		System.out.printf("Resultado: %.2f", resultado);
	}

}
