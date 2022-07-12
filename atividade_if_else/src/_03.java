import java.util.Scanner;

public class _03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dia1, mes1, ano1, dia2, mes2, ano2;

		System.out.print("Dia da primeira data: ");
		dia1 = sc.nextInt();
		System.out.print("Mês da primeira data: ");
		mes1 = sc.nextInt();
		System.out.print("Ano da primeira data: ");
		ano1 = sc.nextInt();
		System.out.print("Dia da segunda data: ");
		dia2 = sc.nextInt();
		System.out.print("Mês da segunda data: ");
		mes2 = sc.nextInt();
		System.out.print("Ano da segunda data: ");
		ano2 = sc.nextInt();

		if (ano1 > ano2) {
			System.out.print("A primeira data é maior!");
		} else if (ano2 > ano1) {
			System.out.print("A segunda data é maior!");
		} else {

			if (mes1 > mes2) {
				System.out.print("A primeira data é maior!");
			} else if (mes2 > mes1) {
				System.out.print("A segunda data é maior!");
			} else {

				if (dia1 > dia2) {
					System.out.print("A primeira data é maior!");
				} else if (dia2 > dia1) {
					System.out.print("A segunda data é maior!");
				} else {
					System.out.print("As duas datas são iguais!");
				}
			}
		}

		sc.close();
		
	}

}
