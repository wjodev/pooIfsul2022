package model;

public class Retangulo {
	private float area;
	private float perimetro;
	
	public float getArea() {
		return area;
	}
	
	public float getPerimetro() {
		return perimetro;
	}
	
	public float calcularArea(float l1, float l2) {
		
		this.area = l1 * l2;
		
		return this.area;
	}

	public float calcularPerimetro(float l1, float l2) {
		
		this.perimetro = 2 * (l1 + l2);
		
		return this.perimetro;
	}
	
}
