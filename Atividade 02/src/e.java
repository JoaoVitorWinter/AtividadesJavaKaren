import java.util.Scanner;

public class e {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double wage, sells;
		
		System.out.print("Digite seu sal�rio fixo: ");
		wage = sc.nextDouble();
		System.out.print("Digite o valor de suas vendas: ");
		sells = sc.nextDouble();
		
		System.out.printf("Sua comiss�o foi de R$%.2f", (sells * 0.04));
		System.out.printf("\nSeu sal�rio final foi de R$%.2f", (wage + sells * 0.04));
		
		sc.close();
		
	}

}
