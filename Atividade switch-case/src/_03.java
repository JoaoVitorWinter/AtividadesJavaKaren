import java.util.Scanner;

public class _03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int qtd;
		
		System.out.print("Digite a quantidade de livros: ");
		qtd = sc.nextInt();
		
		if(qtd * 0.25 + 7.5 < qtd * 0.5 + 2.5) {
			System.out.print("A melhor opção de desconto é o critério A.");
		} else if(qtd * 0.25 + 7.5 > qtd * 0.5 + 2.5) {
			System.out.print("A melhor opção de desconto é o critério B.");
		} else {
			System.out.println("Nenhuma opção é melhor.");
		}
		
		sc.close();
		
	}

}
