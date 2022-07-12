import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String conceito = "A";
		double nota, total = 0;

		System.out.println("Notas:");
		System.out.print("Trabalho de laboratório: ");
		nota = sc.nextDouble();
		total += nota * 0.2;
		System.out.print("Avaliação semestral: ");
		nota = sc.nextDouble();
		total += nota * 0.3;
		System.out.print("Exame final: ");
		nota = sc.nextDouble();
		total += nota * 0.5;

		System.out.printf("Média ponderada: %.2f", total);

		if (total < 5) {
			conceito = "E";
		}

		if (total >= 5 && total < 6) {
			conceito = "D";
		}

		if (total >= 6 && total < 7) {
			conceito = "C";
		}

		if (total >= 7 && total < 8) {
			conceito = "B";
		}

		System.out.print("\nConceito: " + conceito);

		sc.close();

	}

}
