package model;
public class Conta {
    private int codigo;
    private String correntista;
    private float saldo;
    
    
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCorrentista() {
		return correntista;
	}
	public void setCorrentista(String correntista) {
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