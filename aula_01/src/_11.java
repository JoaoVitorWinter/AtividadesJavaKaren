import java.util.Scanner;

public class _11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome, endereço, telefone;
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite seu endereço: ");
		endereço = sc.nextLine();
		
		System.out.println("Digite seu telefone: ");
		telefone = sc.nextLine();
		
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereço);
		System.out.println("Nome: " + telefone);
	}

}
