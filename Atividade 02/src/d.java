import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double preco;
		
		System.out.print("Digite o pre�o antigo do produto: ");
		preco = sc.nextDouble();
		
		System.out.printf("O novo pre�o do produto � R$%.2f", (preco * 0.9));
		
		sc.close();
		
	}

}
