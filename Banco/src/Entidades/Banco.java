package Entidades;

import java.util.Scanner;

public class Banco {
	Scanner sc = new Scanner(System.in);

	public byte escolha;
	public String lingua;

	public void menu() {
		switch (this.lingua) {
		case "pt-br":
			System.out.println("----------------------------------------");
			System.out.println("| 1. Ver perfil                        |");
			System.out.println("| 2. Ver saldo                         |");
			System.out.println("| 3. Depositar                         |");
			System.out.println("| 4. Transferir                        |");
			System.out.println("| 5. Sair                              |");
			System.out.println("----------------------------------------\n");
			break;
		case "en":
			System.out.println("----------------------------------------");
			System.out.println("| 1. See profile                       |");
			System.out.println("| 2. See balance                       |");
			System.out.println("| 3. Deposit                           |");
			System.out.println("| 4. Transfer                          |");
			System.out.println("| 5. Leave                             |");
			System.out.println("----------------------------------------\n");
			break;
		case "de":
			System.out.println("----------------------------------------");
			System.out.println("| 1. Profil anzeigen                   |");
			System.out.println("| 2. Siehe Gleichgewich                |");
			System.out.println("| 3. Kaution                           |");
			System.out.println("| 4. Transfer                          |");
			System.out.println("| 5. Hinausgehen                       |");
			System.out.println("----------------------------------------\n");
			break;
		default:
			break;
		}
		this.escolha = sc.nextByte();
	}

	public void mudarLingua(byte escolha) {
		switch (escolha) {
		case 1:
			this.lingua = "pt-br";
			break;
		case 2:
			this.lingua = "en";
			break;
		case 3:
			this.lingua = "de";
			break;
		default:
			System.out.println("!!\n");
		}

	}
}
