package application;
 import java.util.Scanner;

import entidades.Banco;
import entidades.Cliente;
import entidades.ContaPessoal;

import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Banco banco = new Banco();
		Cliente cliente = new Cliente();
		ContaPessoal conta = new ContaPessoal();
		Boolean verificacao = false;

		conta.setSaldo(0);

		while (banco.getLingua() == null) {
			System.out.println("1. Portugu�s;\n2. English;\n3. Deutsch.");
			banco.mudarLingua(sc.nextByte());
		}

		switch (banco.getLingua()) {
		case "pt-br":
			System.out.println("Seja bem-vindo ao banco Lacto!");
			System.out.println(
					"Pe�o que nos passe suas informa��es pessoais, para que voc� possa ter uma conta no nosso banco.");
			
			do
				
			try {
			System.out.print("Nome: ");
			cliente.setNome(sc.next());
			System.out.print("Endere�o: ");
			cliente.setEndereco(sc.next());
			System.out.print("Of�cio: ");
			cliente.setOficio(sc.next());
			System.out.print("CPF: ");
			cliente.setCpf(sc.nextLong());
			System.out.print("Renda: ");
			cliente.setRenda(sc.nextDouble());
			System.out.print("Agora em rela��o a conta pessoal, escolha um n�mero: ");
			conta.setNumero(sc.nextShort());
			System.out.print("N�mero da ag�ncia: ");
			conta.setAgencia(sc.nextShort());
			
			verificacao = true;
			
			} catch(InputMismatchException erro) {
				System.err.println("\nColoque informa��es v�lidas!\n");
				sc.nextLine();
			}
			
			while(!verificacao);

			while (banco.getEscolha() != 5) {
				banco.menu();
				System.out.println("\n");
				switch (banco.getEscolha()) {
				case 1:
					conta.perfil(cliente, "pt-br");
					break;
				case 2:
					System.out.println("Saldo: R$" + conta.getSaldo() + "\n");
					break;
				case 3:
					System.out.print("Quantia a depositar: ");
					conta.depositar(sc.nextDouble(), "pt-br");
					break;
				case 4:
					System.out.print("Quantia a transferir: ");
					conta.transferir(sc.nextDouble(), "pt-br");
					break;
				case 5:
					System.out.print("Obrigado pela prefer�ncia. At� a pr�xima!");
					break;
				default:
					System.out.println("Op��o inv�lida!\n");
					break;
				}
			}
			break;
		case "en":
			System.out.println("Welcome to Lacto Bank!");
			System.out.println(
					"I ask you to give us your personal information so that you can have an account with our bank.");
			
			do {
				
				try {
					
			System.out.print("Name: ");
			cliente.setNome(sc.next());
			System.out.print("Address: ");
			cliente.setEndereco(sc.next());
			System.out.print("Work: ");
			cliente.setOficio(sc.next());
			System.out.print("CPF: ");
			cliente.setCpf(sc.nextLong());
			System.out.print("Income: ");
			cliente.setRenda(sc.nextDouble());
			System.out.print("Now in relation to the personal account, choose a number: ");
			conta.setNumero(sc.nextShort());
			System.out.print("Agency Number: ");
			conta.setAgencia(sc.nextShort());
			
				verificacao = true;
				
				} catch(InputMismatchException erro) {
					System.err.println("\nEnter valid information!\n");
					sc.nextLine();
				}
			} while (!verificacao);

			while (banco.getEscolha() != 5) {
				banco.menu();
				System.out.println("\n");
				switch (banco.getEscolha()) {
				case 1:
					conta.perfil(cliente, "en");
					break;
				case 2:
					System.out.println("Balance: R$" + conta.getSaldo() + "\n");
					break;
				case 3:
					System.out.print("Amount to deposit: ");
					conta.depositar(sc.nextDouble(), "en");
					break;
				case 4:
					System.out.print("Amount to transfer: ");
					conta.transferir(sc.nextDouble(), "en");
					break;
				case 5:
					System.out.print("Thank you for your preference. To the next!");
					break;
				default:
					System.out.println("Invalid option!\n");
					break;
				}
			}
			break;
		case "de":
			System.out.println("Willkommen bei der Lacto Bank!");
			System.out.println(
					"Ich bitte Sie, uns Ihre pers�nlichen Daten mitzuteilen, damit Sie ein Konto bei unserer Bank er�ffnen k�nnen.");
			
			do {
				
				try {
					
			System.out.print("Name: ");
			cliente.setNome(sc.next());
			System.out.print("Adresse: ");
			cliente.setEndereco(sc.next());
			System.out.print("Arbeit: ");
			cliente.setOficio(sc.next());
			System.out.print("CPF: ");
			cliente.setCpf(sc.nextLong());
			System.out.print("Einkommen: ");
			cliente.setRenda(sc.nextDouble());
			System.out.print("W�hlen Sie nun in Bezug auf das pers�nliche Konto eine Nummer aus: ");
			conta.setNumero(sc.nextShort());
			System.out.print("Agenturnummer: ");
			conta.setAgencia(sc.nextShort());

			verificacao = true;
			
			} catch(InputMismatchException erro) {
				System.err.println("\nGeben Sie g�ltige Informationen ein!\n");
				sc.nextLine();
			}
		} while (!verificacao);

			while (banco.getEscolha() != 5) {
				banco.menu();
				System.out.println("\n");
				switch (banco.getEscolha()) {
				case 1:
					conta.perfil(cliente, "de");
					break;
				case 2:
					System.out.println("Gleichgewicht: R$" + conta.getSaldo() + "\n");
					break;
				case 3:
					System.out.print("Einzuzahlender Betrag: ");
					conta.depositar(sc.nextDouble(), "de");
					break;
				case 4:
					System.out.print("Zu �berweisender Betrag: ");
					conta.transferir(sc.nextDouble(), "de");
					break;
				case 5:
					System.out.print("Vielen Dank f�r Ihre Pr�ferenz. Zum n�chsten!");
					break;
				default:
					System.out.println("Ung�ltige Option!\n");
					break;
				}
			}
			break;
		default:
			break;
		}
	}

}
