package entidades;

import java.util.Scanner;

public class Calculadora {
	
	Scanner sc = new Scanner(System.in);
	public double resultado = 0;
	public int quantidade = 0;
	
	public void quantidade() {
		System.out.print("\nQuantidade (1-5): ");
		this.quantidade = sc.nextInt();

		if (this.quantidade > 5) {
			this.quantidade = 5;
		} else if (this.quantidade < 1) {
			this.quantidade = 1;
		}
	}
	
	public void soma(double num) {
		this.resultado += num;
	}
	
	public void subtracao(double num) {
		this.resultado -= num;
	}
	public void vezes(double num) {
		this.resultado *= num;
	}
	
	public void divisao(double num) {
		if(num != 0) {
			this.resultado /= num;
		} else {
			System.out.println("Número inválido!");
		}
	}
	
	public void potencia(double num) {
		this.resultado = Math.pow(num, 2);
	}
	
	public void raiz(double num) {
		this.resultado = Math.sqrt(num);
	}
	
	public void porcentagem(double num) {
		this.resultado = this.resultado / num * 100;
	}
	
	
}
