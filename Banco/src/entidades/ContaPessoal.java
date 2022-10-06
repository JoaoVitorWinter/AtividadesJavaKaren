package entidades;

import java.util.Scanner;

public class ContaPessoal {

	Scanner sc = new Scanner(System.in);
	private short numero;
	private short agencia;
	private double saldo;

	public short getNumero() {
		return numero;
	}

	public void setNumero(short numero) {
		this.numero = numero;
	}

	public short getAgencia() {
		return agencia;
	}

	public void setAgencia(short agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double quantia, String lingua) {
		this.saldo += quantia;
		switch (lingua) {
		case "pt-br":
			System.out.print("Dep�sito realizado!\n");
			break;
		case "en":
			System.out.print("Deposit made!\n");
			break;
		case "de":
			System.out.print("Anzahlung geleistet!\n");
			break;
		default:
			break;
		}
	}

	public void transferir(double quantia, String lingua) {
		switch (lingua) {
		case "pt-br":
			if (this.saldo < quantia) {
				System.out.println("Voc� n�o pode transferir!");
			} else {
				this.saldo -= quantia;
				System.out.print("N�mero da conta: ");
				quantia = sc.nextByte();
				if (quantia != this.numero) {
					System.out.println("Transfer�ncia realizada!\n");
				} else {
					System.out.println("Voc� n�o pode transferir!\n");
				}
			}
			break;
		case "en":
			if (this.saldo < quantia) {
				System.out.println("You can't transfer!");
			} else {
				this.saldo -= quantia;
				System.out.print("Account number: ");
				quantia = sc.nextByte();
				if (quantia != this.numero) {
					System.out.println("Transfer performed!\n");
				} else {
					System.out.println("You can't transfer!\n");
				}
			}
			break;
		case "de":
			if (this.saldo < quantia) {
				System.out.println("Du kannst nicht �berweisen!");
			} else {
				this.saldo -= quantia;
				System.out.print("Kontonummer: ");
				quantia = sc.nextByte();
				if (quantia != this.numero) {
					System.out.println("�berweisung durchgef�hrt!\n");
				} else {
					System.out.println("Du kannst nicht �berweisen!\n");
				}
			}
			break;
		default:
			break;
		}
	}

	public void perfil(Cliente cliente, String lingua) {
		switch (lingua) {
		case "pt-br":
			cliente.perfil();
			System.out.println(" N�mero: " + this.numero);
			System.out.println(" Ag�ncia: " + this.agencia);
			System.out.println("--------------------------------------------\n");
			break;
		case "en":
			cliente.perfil();
			System.out.println(" Number: " + this.numero);
			System.out.println(" Agency: " + this.agencia);
			System.out.println("--------------------------------------------\n");
			break;
		case "de":
			cliente.perfil();
			System.out.println(" Nummer: " + this.numero);
			System.out.println(" Agentur: " + this.agencia);
			System.out.println("--------------------------------------------\n");
			break;
		default:
			break;
		}
	}

}
