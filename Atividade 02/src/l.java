import java.util.Scanner;

public class l {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double custo, ingresso;
		
		System.out.print("Digite o custo do espet�culo teatral: ");
		custo = sc.nextDouble();
		System.out.print("Digite o pre�o do ingresso: ");
		ingresso = sc.nextDouble();
		
		System.out.printf("� necess�rio a venda de %.0f ingressos para que o custo do espet�culo seja alcan�ado.", (custo / ingresso + 0.99));
		
		sc.close();
		
	}

}
