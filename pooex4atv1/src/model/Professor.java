package model;

public abstract class Professor {
	protected String nome;
	protected String matricula;
	protected int idade;
	
	public Professor() {
		
	}
	
	Professor (String nome, String matricula, int idade){
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public abstract float retornaSalario();

}
