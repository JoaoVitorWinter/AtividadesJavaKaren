import java.util.Scanner;

public class _16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double base, h;
		
		System.out.println("Digite a base do ret�ngulo: ");
		base = sc.nextDouble();
		
		System.out.println("Digite a altura do ret�ngulo: ");
		h = sc.nextDouble();
		
		System.out.println("�rea: " + (base * h));
		System.out.println("Perimetro: " + (2 * base + 2 * h));
	}

}
