import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade, menor18 = 0;
		double altura, mais80 = 0, somaI1 = 0, somaI2 = 0, peso, somaH = 0;
		
		for(int i = 0; i < 11; i++) {
			System.out.print("Idade: ");
			idade = sc.nextInt();
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			
			somaI1 += idade;
			somaH += altura;
			
			if(idade < 18) {
				menor18++;
			}
			
			if(peso > 80) {
				mais80++;
			}
			
		}
		
		for(int i = 0; i < 11; i++) {
			System.out.print("Idade: ");
			idade = sc.nextInt();
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			
			somaI2 += idade;
			somaH += altura;
			
			if(idade < 18) {
				menor18++;
			}
			
			if(peso > 80) {
				mais80++;
			}
		}
		
		System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + menor18);
		System.out.println("Média das idades dos jogadores de cada time: ");
		System.out.printf("Primeiro time: %.2f\n", (somaI1 / 11));
		System.out.printf("Segundo time: %.2f\n", (somaI2 / 11));
		System.out.printf("Média das alturas de todos os jogadores do campeonato: %.2f\n", (somaH / 22));
		System.out.printf("Porcentagem de jogadores com mais de 80Kg entre todos os jogadores do campeonato: %.2f por cento", (mais80 / 22 * 100));
		
		sc.close();
		
	}

}
