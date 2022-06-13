package model;
public class Conta {
    private int codigo;
    private Pessoa correntista;
    private float saldo;
    
    
    public Conta() {
    	
    }
    
    public Conta (Pessoa correntista, int codigo, float saldo) {
    	this.correntista = correntista;
    	this.codigo = codigo;
    	this.saldo  = saldo;
    }
    
    
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Pessoa getCorrentista() {
		return correntista;
	}
	public void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
 
	
	public boolean sacar(float quantia) {
		
		if (this.saldo - quantia >= 0) {
			
			this.saldo = this.saldo - quantia;
			return true;
		}
		return false;
	}
	
	public void depositar (float quantia) {
		this.saldo = this.saldo + quantia;
	}
}