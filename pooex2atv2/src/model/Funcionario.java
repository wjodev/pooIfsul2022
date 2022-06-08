package model;

public class Funcionario {
	
	private String nome;
	private String sobrenome;
	private int horasTrabalhadas;
	private float valorHora;
	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	

	public void nomeCompleto(String[] args) {
		System.out.println(this.nome + " " + this.sobrenome);
	}
	
	public float calcularSalario() {
		return this.horasTrabalhadas * this.valorHora;
	}
	
	
	public int incrementarHoras(int horas) {
		this.horasTrabalhadas = this.horasTrabalhadas + horas;
		return this.horasTrabalhadas;
	}
}