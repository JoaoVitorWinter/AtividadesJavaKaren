import java.util.Scanner;

public class _17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio;
		
		System.out.println("Digite o raio do c�rculo: ");
		raio = sc.nextDouble();
		
		System.out.println("Perimetro: " + (2 * 3.1415 * raio));
		System.out.println("�rea: " + (raio * raio * 3.1415));
	}

}
