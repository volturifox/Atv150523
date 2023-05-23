package hopital;

public class Paciente {
	private String nome;
	private String cpf;
	private int nivelPrioridade;
	
	public Paciente(String nome, String cpf, int nivelPrioridade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.nivelPrioridade = nivelPrioridade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNivelPrioridade() {
		return nivelPrioridade;
	}

	public void setNivelPrioridade(int nivelPrioridade) {
		this.nivelPrioridade = nivelPrioridade;
	}
	
	
}
