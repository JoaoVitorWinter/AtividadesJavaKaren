import java.util.Scanner;

public class _18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double base, h;
		
		System.out.println("Digite a base do triângulo: ");
		base = sc.nextDouble();
		
		System.out.println("Digite a altura do triângulo: ");
		h = sc.nextDouble();
		
		System.out.println("Área: " + (base * h / 2));
	}

}
