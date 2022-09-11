package Entidades;

public class Cliente {
	
	public String nome;
	public String endereco;
	public long cpf;
	public String oficio;
	public double renda;
	
	public void perfil() {
		System.out.println("--------------------------------------------");
		System.out.println(" " + this.nome);
		System.out.println(" CPF: " + this.cpf);
	}
	
}
