import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		for(int i = 1; i < 11; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		
		sc.close();
		
	}

}
