import java.util.Scanner;

public class h {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double wage, bill1, bill2;
		
		System.out.print("Digite o sal�rio de Jo�o: ");
		wage = sc.nextDouble();
		System.out.print("Digite a quantia da primeira conta: ");
		bill1 = sc.nextDouble();
		System.out.print("Digite a quantia da segunda conta: ");
		bill2 = sc.nextDouble();
		
		System.out.printf("O que resta do sal�rio do Jo�o � R$%.2f", (wage - bill1 * 1.02 - bill2 * 1.02));
		
		sc.close();
		
	}

}
