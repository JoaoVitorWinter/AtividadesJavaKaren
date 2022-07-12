import java.util.Scanner;

public class l {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double custo, ingresso;
		
		System.out.print("Digite o custo do espetáculo teatral: ");
		custo = sc.nextDouble();
		System.out.print("Digite o preço do ingresso: ");
		ingresso = sc.nextDouble();
		
		System.out.printf("É necessário a venda de %.0f ingressos para que o custo do espetáculo seja alcançado.", (custo / ingresso + 0.99));
		
		sc.close();
		
	}

}
