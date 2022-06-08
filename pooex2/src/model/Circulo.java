package model;

public class Circulo {
	
	private float raio;
	private float areaDisco;
	private float circuferencia;
	private float superficie;
	private float volume;
	private float pi =3.141592f;
	
	
	
	
	public float getRaio() {
		return raio;
	}
	
	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	public float getAreaDisco() {
		return areaDisco;
	}

	public float getCircuferencia() {
		return circuferencia;
	}
	
	public float getSuperficie() {
		return superficie;
	}


	public float getVolume() {
		return volume;
	}


	public float calcularAreaDisco () {
		this.areaDisco =  raio * raio * pi;
		
		return this.areaDisco;
	}
	
	public float calcularCircuferencia () {
		this.circuferencia =  2 * raio * pi;
		
		return this.circuferencia;
	}
	
	public float supercie () {
		this.superficie =  4 * pi * raio * raio;
		
		return this.superficie;
	}
	
	public float volume () {
		this.volume =  (4 * pi * raio * raio * raio)/3 ;
		
		return this.volume;
	}
}



