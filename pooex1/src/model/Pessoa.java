package model;
public class Pessoa {
    private String nome;
    private int idade;
    private long celular;
    private Endereco endereco;
    
    public Pessoa() {
    	
    }
    
    public Pessoa(String nome, int idade, long celular, Endereco endereco) {
    	this.nome = nome;
    	this.idade = idade;
    	this.celular = celular;
    	this.endereco = endereco;
    }
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public long getCelular() {
		return celular;
	}
	public void setCelular(long celular) {
		this.celular = celular;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
    
    
    
}