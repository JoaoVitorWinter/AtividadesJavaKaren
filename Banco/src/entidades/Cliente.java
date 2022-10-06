package entidades;

public class Cliente {
	
	private String nome;
	private String endereco;
	private long cpf;
	private String oficio;
	private double renda;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public void perfil() {
		System.out.println("--------------------------------------------");
		System.out.println(" " + this.nome);
		System.out.println(" CPF: " + this.cpf);
	}
	
}
