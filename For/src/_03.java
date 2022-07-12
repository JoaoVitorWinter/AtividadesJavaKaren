import java.util.Scanner;

public class _03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, numP, numPT = 0, numM = 0, numF = 0, numMax = 0;
		double wageMin = 1000, wage, wageT = 0, somaM = 0, somaF = 0, wageMax = 0;
		String sex;
		
		for(int i = 0; i < 15; i++) {
			System.out.print("Número do operário: ");
			num = sc.nextInt();
			System.out.print("Número de peças fabricadas no mês: ");
			numP = sc.nextInt();
			System.out.print("Sexo do funcionário (M ou F): ");
			sex = sc.next();
			
			numPT += numP;
			
			if(numP <= 30) {
				wage = wageMin;
			} else if(numP <= 50) {
				wage = wageMin + (wageMin * 0.03 * (numP - 30));
			} else {
				wage = wageMin + (wageMin * 0.05 * (numP - 30));
			}
			
			if(sex.equals("M")) {
				numM++;
				somaM += numP;
			} else {
				numF++;
				somaF += numP;
			}
			
			if(wage > wageMax) {
				wageMax = wage;
				numMax = num;
			}
			wageT += wage;
			
			System.out.print("O(A) funcionário(a) " + num + " tem como salário: R$");
			System.out.printf("%.2f\n", wage);
			
		}
		
		System.out.printf("Total de folha de pagamento da fábrica: R$%.2f\n", wageT);
		System.out.println("Número de total de peças fabricadas no mês: " + numPT);
		System.out.printf("Média de peças fabricadas pelos homens: %.2f\n", (somaM / numM));
		System.out.printf("Média de peças fabricadas pelas mulheres: %.2f\n", (somaF / numF));
		System.out.print("Número do operário(a) de maior salário: " + numMax);
		
		sc.close();
		
	}

}
