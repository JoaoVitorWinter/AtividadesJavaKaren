import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, x = 1;
		boolean primo = true;
		
		System.out.print("Digite um número maior que 1: ");
		num = sc.nextInt();
		
		do {
			
			if(num % x == 0 && x != 1) {
				primo = false;
				break;
			}
			
			x++;
			
		} while (num > x);
		
		if(primo && num > 1) {
			System.out.print("O número é primo!");
		} else {
			System.out.print("O número não é primo!");
		}
		
		sc.close();
		
	}

}
