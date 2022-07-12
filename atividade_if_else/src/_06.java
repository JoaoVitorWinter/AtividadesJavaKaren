import java.util.Scanner;

public class _06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int escolha;
		double salario;

		System.out.println("Menu de op��es:");
		System.out.println("1. Imposto");
		System.out.println("2. Novo sal�rio");
		System.out.println("3. Classifica��o");
		System.out.println("Digite a op��o desejada.");
		escolha = sc.nextInt();

		if (escolha == 1 || escolha == 2 || escolha == 3) {
			System.out.print("Sal�rio: ");
			salario = sc.nextDouble();

			if (escolha == 1) {

				if (salario < 500) {
					salario *= 0.05;
				} else if (salario <= 850) {
					salario *= 0.1;
				} else {
					salario *= 0.15;
				}

				System.out.printf("Valor do imposto: R$%.2f", salario);
			} else if (escolha == 2) {

				if (salario > 1500) {
					salario += 25;
				} else if (salario >= 750) {
					salario += 50;
				} else if (salario >= 450) {
					salario += 75;
				} else {
					salario += 100;
				}

				System.out.print("Novo sal�rio: " + salario);
			} else {

				if (salario <= 700) {
					System.out.print("Classifica��o: mal remunerado");
				} else {
					System.out.print("Classifica��o: bem remunerado");
				}
			}
		} else {
			System.out.print("C�digo inv�lido!");
		}

		sc.close();

	}

}
