import java.util.Scanner;

public class _13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite um número inteiro: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite outro: ");
		num2 = sc.nextInt();
		
		System.out.println("Produto: " + (num1 * num2));
	}

}
