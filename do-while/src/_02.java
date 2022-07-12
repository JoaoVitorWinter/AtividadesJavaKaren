import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 1, codigo, numA2000 = 0, maiorC = 0, menorC = 0;
		double numV, numA, somaV = 0, somaA2000 = 0, maior = 0, menor = 999999;
		
		
		do {
			System.out.println("Dados da " + i + "º cidade:");
			System.out.print("Código da cidade: ");
			codigo = sc.nextInt();
			System.out.print("Número de veículos de passeio: ");
			numV = sc.nextInt();
			System.out.print("Número de acidentes de trânsito com vítimas: ");
			numA = sc.nextInt();
			
			somaV += numV;
			
			if(numV < 2000) {
				somaA2000 += numA;
				numA2000++;
			}
			
			if(numA / numV > maior) {
				maior = numA / numV;
				maiorC = codigo;
			}
			
			if(numA / numV < menor) {
				menor = numA / numV;
				menorC = codigo;
			}
			
			i++;
			
		} while(i < 6);
		
		System.out.print("A cidade " + maiorC + " possui o maior índice de acidentes, com ");
		System.out.printf("%.3f de acidentes por veículo.", maior);
		System.out.print("\nA cidade " + menorC + " possui o menor índice de acidentes, com ");
		System.out.printf("%.3f de acidentes por veículo.", menor);
		System.out.println("\nMédia de veículos nas cinco cidades juntas: " + (somaV / 5));
		System.out.print("Média de acidentes de transito nas cidades com menos de 2.000 veículos: " + (somaA2000 / numA2000));
		
		sc.close();
		
	}

}
