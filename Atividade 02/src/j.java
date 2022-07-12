import java.util.Scanner;

public class j {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double money;
		
		System.out.print("Digite quanto você possui em reais: ");
		money = sc.nextDouble();
		
		System.out.printf("Dólar: US$%.2f", (money / 4.97));
		System.out.printf("\nEuro: €%.2f", (money / 5.23));
		System.out.printf("\nLibra esterlina: £%.2f", (money / 6.25));
		
		sc.close();
		
	}

}
