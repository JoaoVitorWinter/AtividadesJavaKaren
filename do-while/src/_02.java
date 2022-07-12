import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 1, codigo, numA2000 = 0, maiorC = 0, menorC = 0;
		double numV, numA, somaV = 0, somaA2000 = 0, maior = 0, menor = 999999;
		
		
		do {
			System.out.println("Dados da " + i + "� cidade:");
			System.out.print("C�digo da cidade: ");
			codigo = sc.nextInt();
			System.out.print("N�mero de ve�culos de passeio: ");
			numV = sc.nextInt();
			System.out.print("N�mero de acidentes de tr�nsito com v�timas: ");
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
		
		System.out.print("A cidade " + maiorC + " possui o maior �ndice de acidentes, com ");
		System.out.printf("%.3f de acidentes por ve�culo.", maior);
		System.out.print("\nA cidade " + menorC + " possui o menor �ndice de acidentes, com ");
		System.out.printf("%.3f de acidentes por ve�culo.", menor);
		System.out.println("\nM�dia de ve�culos nas cinco cidades juntas: " + (somaV / 5));
		System.out.print("M�dia de acidentes de transito nas cidades com menos de 2.000 ve�culos: " + (somaA2000 / numA2000));
		
		sc.close();
		
	}

}
