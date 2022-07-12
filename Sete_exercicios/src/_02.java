import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double total = 0, media;

		System.out.print("Nota 1: ");
		total += sc.nextDouble();
		System.out.print("Nota 2: ");
		total += sc.nextDouble();
		System.out.print("Nota 3: ");
		total += sc.nextDouble();

		media = total / 3;

		if (media < 3) {
			System.out.print("Reprovado!");
		}

		if (media >= 3 && media < 7) {
			System.out.println("Em exame!");
			System.out.printf("Nota que deverá tirar: %.2f", (12 - media));

		}

		if (media >= 7) {
			System.out.print("Aprovado!");
		}

		sc.close();

	}

}
