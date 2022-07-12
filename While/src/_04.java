import java.util.Scanner;

public class _04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double wageMin, Kw, conta, valor, sum = 0;
		int escolha, i = 0;

		System.out.print("Salário mínimo: ");
		wageMin = sc.nextDouble();

		valor = wageMin / 8;

		while (true) {
			conta = 0;
			System.out.print("Quantidade de Kw gasta: ");
			Kw = sc.nextDouble();

			if (Kw == 0) {
				break;
			}

			System.out.print("Tipo de consumidor: ");
			escolha = sc.nextInt();

			conta = Kw * valor;
			switch (escolha) {
			case 1:
				conta *= 1.05;
				break;
			case 2:
				conta *= 1.1;
				break;
			case 3:
				conta *= 1.15;
				break;
			default:
				System.out.print("Número inválido!");
			}
			
			System.out.print("Valor a ser pago pelo consumidor: R$" + conta + "\n");
			sum += conta;
			
			if(conta >= 500 && conta <= 1000) {
				i++;
			}
			
		}
		
		System.out.println("Faturamento geral da empresa: R$" + sum);
		System.out.print("Quantidade de consumidores que pagam entre R$500,00 e R$1.000,00: " + i);
		
		sc.close();
		
	}

}
