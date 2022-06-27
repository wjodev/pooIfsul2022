package model;

public class ProfRegime extends Professor{
	private float salario;

	public ProfRegime() {
		super();
	}

	public ProfRegime(String nome, String matricula, int idade, float salario) {
		super(nome, matricula, idade);
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float retornaSalario() {
		this.salario = this.salario - (this.salario*0.12f);
		return this.salario;
	}
	
}
