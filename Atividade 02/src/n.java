import java.util.Scanner;

public class n {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double saco, porcao;
		
		System.out.print("Digite o peso do saco de ração em gramas: ");
		saco = sc.nextDouble();
		System.out.print("Digite a quantidade de ração fornecida para cada gato em gramas: ");
		porcao = sc.nextDouble();
		
		System.out.printf("Restará %.2f de ração após cinco dias.", (saco - porcao * 10));
		
		sc.close();
	}

}
