import java.util.Scanner;

public class _03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, numP, numPT = 0, numM = 0, numF = 0, numMax = 0;
		double wageMin = 1000, wage, wageT = 0, somaM = 0, somaF = 0, wageMax = 0;
		String sex;
		
		for(int i = 0; i < 15; i++) {
			System.out.print("N�mero do oper�rio: ");
			num = sc.nextInt();
			System.out.print("N�mero de pe�as fabricadas no m�s: ");
			numP = sc.nextInt();
			System.out.print("Sexo do funcion�rio (M ou F): ");
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
			
			System.out.print("O(A) funcion�rio(a) " + num + " tem como sal�rio: R$");
			System.out.printf("%.2f\n", wage);
			
		}
		
		System.out.printf("Total de folha de pagamento da f�brica: R$%.2f\n", wageT);
		System.out.println("N�mero de total de pe�as fabricadas no m�s: " + numPT);
		System.out.printf("M�dia de pe�as fabricadas pelos homens: %.2f\n", (somaM / numM));
		System.out.printf("M�dia de pe�as fabricadas pelas mulheres: %.2f\n", (somaF / numF));
		System.out.print("N�mero do oper�rio(a) de maior sal�rio: " + numMax);
		
		sc.close();
		
	}

}
