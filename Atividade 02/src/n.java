import java.util.Scanner;

public class n {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double saco, porcao;
		
		System.out.print("Digite o peso do saco de ra��o em gramas: ");
		saco = sc.nextDouble();
		System.out.print("Digite a quantidade de ra��o fornecida para cada gato em gramas: ");
		porcao = sc.nextDouble();
		
		System.out.printf("Restar� %.2f de ra��o ap�s cinco dias.", (saco - porcao * 10));
		
		sc.close();
	}

}
