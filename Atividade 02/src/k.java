import java.util.Scanner;

public class k {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h, min;
		
		System.out.print("Digite as horas do hor�rio: ");
		h = sc.nextInt();
		System.out.print("Digite os minutos do hor�rio: ");
		min = sc.nextInt();
		
		System.out.println("As horas em minutos � " + (h * 60));
		System.out.println("O total de minutos � " + (h * 60 + min));
		System.out.print("O total de segundos � " + ((h * 60 + min) * 60));
		
		sc.close();
		
	}

}
