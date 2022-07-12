import java.util.Scanner;

public class _10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		System.out.println("O número antecessor é " + (num - 1));
		System.out.println("O número sucessor é " + (num + 1));
	}

}
