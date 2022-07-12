import java.util.Scanner;

public class _03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, i = 0, iPar = 0, max = 0, min = 999999;
		double sum = 0, sumPar = 0;
		
		while(true) {
			System.out.print("Digite um número: ");
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
		
		System.out.println("Soma dos números digitados: " + sum);
		System.out.println("Quantidade de números digitados: " + i);
		System.out.println("O maior número digitado: " + max);
		System.out.println("O menor número digitado: " + min);
		System.out.printf("Média dos números pares: %.2f\n", (sumPar / iPar));
		System.out.printf("Porcentagem de números ímpares entre todos os números digitados: %.2f por cento", ((double) (i - iPar) / i * 100));
		
		sc.close();
	}

}
