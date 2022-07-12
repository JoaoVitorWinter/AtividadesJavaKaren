import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int produto, pais;
		double preco = 0, peso, imposto = 0;

		System.out.print("Código do produto: ");
		produto = sc.nextInt();

		System.out.print("Peso do produto (em Kg): ");
		peso = sc.nextDouble();

		System.out.print("Código do país de origem:");
		pais = sc.nextInt();

		switch (pais) {
		case 1:
			break;
		case 2:
			imposto = 0.15;
			break;
		case 3:
			imposto = 0.25;
			break;
		default:
			System.out.println("Informações erradas!");
		}
		
		if(produto > 0 && produto < 5) {
			preco = peso * 10;
		} else if(produto > 4 && produto < 8) {
			preco = peso * 25;
		} else if(produto > 7 && produto < 11) {
			preco = peso * 35;
		} else {
			System.out.println("Informações erradas!");
		}
		
		System.out.println("Peso do produto: " + peso + "Kg");
		System.out.println("Preço total do produto: R$" + preco);
		System.out.println("Valor do imposto: R$" + (preco * imposto));
		System.out.print("Valor total: R$" + (preco + preco * imposto));
		
		sc.close();
		
	}

}
