import java.util.Scanner;

public class g {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.print("Digite um número: ");
		num = sc.nextDouble();
		
		System.out.println("\nTabuada:");
		
		System.out.println("1  x " + num + " = " + (num * 1) + ";");
		System.out.println("2  x " + num + " = " + (num * 2) + ";");
		System.out.println("3  x " + num + " = " + (num * 3) + ";");
		System.out.println("4  x " + num + " = " + (num * 4) + ";");
		System.out.println("5  x " + num + " = " + (num * 5) + ";");
		System.out.println("6  x " + num + " = " + (num * 6) + ";");
		System.out.println("7  x " + num + " = " + (num * 7) + ";");
		System.out.println("8  x " + num + " = " + (num * 8) + ";");
		System.out.println("9  x " + num + " = " + (num * 9) + ";");
		System.out.println("10 x " + num + " = " + (num * 10) + ".");
		
		sc.close();
		
	}

}
