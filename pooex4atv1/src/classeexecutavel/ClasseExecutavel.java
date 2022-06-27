package classeexecutavel;

import model.ProfHorista;
import model.ProfRegime;

public class ClasseExecutavel {
	
	public static void main(String[] args) {
		
		
		ProfHorista ph1 = new ProfHorista("Maria","20078PH",33, 90f, 27);
		ProfRegime pr1 = new ProfRegime("Martins", "20079PR", 20, 3200f);
		
		System.out.println("\nProfessor horista salario: " + ph1.retornaSalario());
		System.out.println("\nProfessor regime salario: " + pr1.retornaSalario());
	}
}