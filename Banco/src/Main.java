import java.util.Scanner;
import Entidades.Banco;
import Entidades.Cliente;
import Entidades.ContaPessoal;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Banco banco = new Banco();
		Cliente cliente = new Cliente();
		ContaPessoal conta = new ContaPessoal();

		conta.saldo = 0;

		while (banco.lingua == null) {
			System.out.println("1. Português;\n2. English;\n3. Deutsch.");
			banco.mudarLingua(sc.nextByte());
		}

		switch (banco.lingua) {
		case "pt-br":
			System.out.println("Seja bem-vindo ao banco Lacto!");
			System.out.println(
					"Peço que nos passe suas informações pessoais, para que você possa ter uma conta no nosso banco.");
			System.out.print("Nome: ");
			cliente.nome = sc.next();
			System.out.print("Endereço: ");
			cliente.endereco = sc.next();
			System.out.print("Ofício: ");
			cliente.oficio = sc.next();
			System.out.print("CPF: ");
			cliente.cpf = sc.nextLong();
			System.out.print("Renda: ");
			cliente.renda = sc.nextDouble();
			System.out.print("Agora em relação a conta pessoal, escolha um número: ");
			conta.numero = sc.nextShort();
			System.out.print("Número da agência: ");
			conta.agencia = sc.nextShort();

			while (banco.escolha != 5) {
				banco.menu();
				System.out.println("\n");
				switch (banco.escolha) {
				case 1:
					conta.perfil(cliente, "pt-br");
					break;
				case 2:
					System.out.println("Saldo: R$" + conta.saldo + "\n");
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
					System.out.print("Obrigado pela preferência. Até a próxima!");
					break;
				default:
					System.out.println("Opção inválida!\n");
					break;
				}
			}
			break;
		case "en":
			System.out.println("Welcome to Lacto Bank!");
			System.out.println(
					"I ask you to give us your personal information so that you can have an account with our bank.");
			System.out.print("Name: ");
			cliente.nome = sc.next();
			System.out.print("Address: ");
			cliente.endereco = sc.next();
			System.out.print("Work: ");
			cliente.oficio = sc.next();
			System.out.print("CPF: ");
			cliente.cpf = sc.nextLong();
			System.out.print("Income: ");
			cliente.renda = sc.nextDouble();
			System.out.print("Now in relation to the personal account, choose a number: ");
			conta.numero = sc.nextShort();
			System.out.print("Agency Number: ");
			conta.agencia = sc.nextShort();

			while (banco.escolha != 5) {
				banco.menu();
				System.out.println("\n");
				switch (banco.escolha) {
				case 1:
					conta.perfil(cliente, "en");
					break;
				case 2:
					System.out.println("Balance: R$" + conta.saldo + "\n");
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
					"Ich bitte Sie, uns Ihre persönlichen Daten mitzuteilen, damit Sie ein Konto bei unserer Bank eröffnen können.");
			System.out.print("Name: ");
			cliente.nome = sc.next();
			System.out.print("Adresse: ");
			cliente.endereco = sc.next();
			System.out.print("Arbeit: ");
			cliente.oficio = sc.next();
			System.out.print("CPF: ");
			cliente.cpf = sc.nextLong();
			System.out.print("Einkommen: ");
			cliente.renda = sc.nextDouble();
			System.out.print("Wählen Sie nun in Bezug auf das persönliche Konto eine Nummer aus: ");
			conta.numero = sc.nextShort();
			System.out.print("Agenturnummer: ");
			conta.agencia = sc.nextShort();

			while (banco.escolha != 5) {
				banco.menu();
				System.out.println("\n");
				switch (banco.escolha) {
				case 1:
					conta.perfil(cliente, "de");
					break;
				case 2:
					System.out.println("Gleichgewicht: R$" + conta.saldo + "\n");
					break;
				case 3:
					System.out.print("Einzuzahlender Betrag: ");
					conta.depositar(sc.nextDouble(), "de");
					break;
				case 4:
					System.out.print("Zu überweisender Betrag: ");
					conta.transferir(sc.nextDouble(), "de");
					break;
				case 5:
					System.out.print("Vielen Dank für Ihre Präferenz. Zum nächsten!");
					break;
				default:
					System.out.println("Ungültige Option!\n");
					break;
				}
			}
			break;
		default:
			break;
		}
	}

}
