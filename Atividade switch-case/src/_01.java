import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String cargoS = "nenhum";
		int cargo;
		double salario, aumento = 0;

		System.out.print("C�digo correspondente ao cargo: ");
		cargo = sc.nextInt();

		System.out.print("Sal�rio atual: ");
		salario = sc.nextDouble();

		switch (cargo) {
		case 1:
			aumento = salario * 0.5;
			cargoS = "escritur�rio";
			break;
		case 2:
			aumento = salario * 0.35;
			cargoS = "secret�rio";
			break;
		case 3:
			aumento = salario * 0.2;
			cargoS = "caixa";
			break;
		case 4:
			aumento = salario * 0.1;
			cargoS = "gerente";
			break;
		case 5:
			cargoS = "diretor";
			break;
		default:
			System.out.println("Informa��es erradas!");
		}
		
		System.out.println("Cargo: " + cargoS);
		System.out.println("Aumento: " + aumento);
		System.out.print("Novo sal�rio: " + (salario + aumento));
		
		sc.close();

	}

}
