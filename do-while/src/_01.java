import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, x = 1;
		boolean primo = true;
		
		System.out.print("Digite um n�mero maior que 1: ");
		num = sc.nextInt();
		
		do {
			
			if(num % x == 0 && x != 1) {
				primo = false;
				break;
			}
			
			x++;
			
		} while (num > x);
		
		if(primo && num > 1) {
			System.out.print("O n�mero � primo!");
		} else {
			System.out.print("O n�mero n�o � primo!");
		}
		
		sc.close();
		
	}

}
