import java.util.Scanner;

import entidades.Calculadora;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Calculadora cd = new Calculadora();
		int escolha;

		System.out.println("Menu: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("5 - Potenciação");
		System.out.println("6 - Raiz quadrada");
		System.out.println("7 - Porcentagem");
		System.out.print("\nEscolha um: ");
		escolha = sc.nextInt();


		switch (escolha) {
		case 1:
			cd.quantidade();
			
			while (cd.quantidade != 0) {
				System.out.print("Digite um número para somar: ");
				cd.soma(sc.nextDouble());
				
				cd.quantidade--;
			}

			break;
		case 2:

			System.out.print("\nDigite um número: ");
			cd.soma(sc.nextDouble());
			
			cd.quantidade();

			while (cd.quantidade != 0) {
				System.out.print("Digite um número para subtrair: ");
				cd.subtracao(sc.nextDouble());
				
				cd.quantidade--;
			}
			break;
		case 3:

			System.out.print("\nDigite um número: ");
			cd.soma(sc.nextDouble());

				System.out.print("Digite um número para multiplicar: ");
				cd.vezes(sc.nextDouble());
			break;
		case 4:
			System.out.print("\nDigite um número: ");
			cd.soma(sc.nextDouble());

				System.out.print("Digite um número para dividir: ");
				cd.divisao(sc.nextDouble());
			break;
		case 5:
			System.out.print("\nDigite um número para calcular seu quadrado: ");
			cd.potencia(sc.nextDouble());
			break;
		case 6:
			System.out.print("\nDigite um número para calcular a raiz quadrada: ");
			cd.raiz(sc.nextDouble());
			break;
		case 7:
			System.out.print("\nDigite um número para ser a porcentagem do total: ");
			cd.soma(sc.nextDouble());

			System.out.print("Digite o total: ");
			cd.porcentagem(sc.nextDouble());
			break;
		default:
			System.out.println("\nEscolheu errado!");
		}

		System.out.printf("Resultado: %.2f", cd.resultado);
	}

}
