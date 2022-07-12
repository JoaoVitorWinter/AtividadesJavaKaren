import java.util.Scanner;

public class _04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int escolha, pNum = 0;
		double valor, variacao = 0, parcela = -1;

		System.out.print("Valor total da compra: ");
		valor = sc.nextDouble();

		System.out.println("1 - Pagamento à vista - 15% de desconto sobre o valor total da compra\r\n"
				+ "2 - Pagamento com cheque pré-datado para 30 dias - 10% de desconto sobre o valor total da compra\r\n"
				+ "3 - Pagamento parcelado em 6 vezes - não tem desconto\r\n"
				+ "4 - Pagamento parcelado em 12 vezes - 8% de acréscimo sobre o valor da compra.\r\n");
		escolha = sc.nextInt();

		switch (escolha) {
		case 1:
			variacao = 0 - (valor * 0.15);
			break;
		case 2:
			variacao = 0 - (valor * 0.1);
			break;
		case 3:
			pNum = 6;
			parcela = valor / 6;
			break;
		case 4:
			pNum = 12;
			variacao = valor * 0.08;
			parcela = (valor + variacao) / 12;
			break;
		default:
			System.out.println("Informações inválidas!");
		}
		
		System.out.println("Valor total da compra: R$" + valor);
		System.out.println("Valor final da compra: R$" + (valor + variacao));
		
		if(variacao < 0) {
			System.out.print("Desconto: R$" + (valor - (valor + variacao)));
		} else if(variacao > 0) {
			System.out.print("Juros: R$" + variacao);
		}
		
		if(parcela >= 0) {
			System.out.println("\nQuantidade de parcelas: " + pNum);
			System.out.printf("Valor da parcela: R$%.2f", parcela);
		}
		
	}

}
