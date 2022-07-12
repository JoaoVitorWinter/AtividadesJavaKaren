import java.util.Scanner;

public class _05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int codigo;
		double salario, reajuste = 0;
		String cargo = "";
		System.out.print("Digite o código: ");
		codigo = sc.nextInt();
		System.out.print("Digite o seu salário: ");
		salario = sc.nextDouble();

		if (codigo >= 1 && codigo <= 5) {

			if (codigo == 1) {
				reajuste = salario * 0.5;
				cargo = "Escriturário";
			} else if (codigo == 2) {
				reajuste = salario * 0.35;
				cargo = "Secretário";
			} else if (codigo == 3) {
				reajuste = salario * 0.2;
				cargo = "Caixa";
			} else if (codigo == 4) {
				reajuste = salario * 0.1;
				cargo = "Gerente";
			} else {
				reajuste = 0;
				cargo = "Diretor";
			}

			System.out.println("\nCargo: " + cargo);
			System.out.printf("Valor do aumento: R$%.2f", reajuste);
			System.out.printf("\nNovo salário: R$%.2f", (salario + reajuste));
		} else {
			System.out.print("Código inválido!");
		}

		sc.close();

	}

}
