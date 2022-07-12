import java.util.Scanner;

public class _03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, i = 0, iPar = 0, max = 0, min = 999999;
		double sum = 0, sumPar = 0;
		
		while(true) {
			System.out.print("Digite um n�mero: ");
			num = sc.nextInt();
			
			if(num == 30000) {
				break;
			}
			
			sum += num;
			i++;
			
			if(num > max) {
				max = num;
			}
			
			if(num < min) {
				min = num;
			}
			
			if(num % 2 == 0) {
				sumPar += num;
				iPar++;
			}
			
		}
		
		System.out.println("Soma dos n�meros digitados: " + sum);
		System.out.println("Quantidade de n�meros digitados: " + i);
		System.out.println("O maior n�mero digitado: " + max);
		System.out.println("O menor n�mero digitado: " + min);
		System.out.printf("M�dia dos n�meros pares: %.2f\n", (sumPar / iPar));
		System.out.printf("Porcentagem de n�meros �mpares entre todos os n�meros digitados: %.2f por cento", ((double) (i - iPar) / i * 100));
		
		sc.close();
	}

}
