import java.util.Scanner;

public class _18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double base, h;
		
		System.out.println("Digite a base do tri�ngulo: ");
		base = sc.nextDouble();
		
		System.out.println("Digite a altura do tri�ngulo: ");
		h = sc.nextDouble();
		
		System.out.println("�rea: " + (base * h / 2));
	}

}
