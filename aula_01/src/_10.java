import java.util.Scanner;

public class _10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um n�mero: ");
		num = sc.nextInt();
		
		System.out.println("O n�mero antecessor � " + (num - 1));
		System.out.println("O n�mero sucessor � " + (num + 1));
	}

}
