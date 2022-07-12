import java.util.Scanner;

public class _16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double base, h;
		
		System.out.println("Digite a base do retângulo: ");
		base = sc.nextDouble();
		
		System.out.println("Digite a altura do retângulo: ");
		h = sc.nextDouble();
		
		System.out.println("Área: " + (base * h));
		System.out.println("Perimetro: " + (2 * base + 2 * h));
	}

}
