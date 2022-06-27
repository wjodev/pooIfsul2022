package model;

public class Notas {

	private float nota1;
	private float nota2;
	private float nota3;
	private float nota4;
	private float media;
	
	public Notas() {
		
	}
	public Notas(float n1, float n2, float n3, float n4) {
		this.nota1 = n1;
		this.nota2 = n2;
		this.nota3 = n3;
		this.nota4 = n4;
	}
	
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	public float getNota3() {
		return nota3;
	}
	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}
	public float getNota4() {
		return nota4;
	}
	public void setNota4(float nota4) {
		this.nota4 = nota4;
	}
	
	public float calculaMedia() {
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		return media;
	}
	
	public boolean  verificarSituacao(){
		
		if(this.media >= 6) {
			return true;
		}else {
			return false;
		}
	}
}