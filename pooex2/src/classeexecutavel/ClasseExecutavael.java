package classeexecutavel;

import model.Circulo;
import model.Retangulo;

public class ClasseExecutavael {

	public static void main(String[] args) {
		 // CIRCULO
		Circulo c1 = new Circulo();
		c1.setRaio(5.0f);
		System.out.println(c1.calcularAreaDisco());
		System.out.println(c1.calcularCircuferencia());
		System.out.println(c1.supercie());
		System.out.println(c1.volume());
		System.out.println();

		
		//RETANGULO	
		Retangulo r1 = new Retangulo();
		
		float l1 = 5.0f, l2 = 10.0f;
		System.out.println(r1.calcularArea(l1,l2));
		System.out.println(r1.calcularPerimetro(l1, l2));
	}

}
