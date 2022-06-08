package classeExecutavel;
import model.Funcionario;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		int horas = 50;
		
		f1.setNome("Joao");
		f1.setSobrenome("Pedro");
		f1.setHorasTrabalhadas(10);
		f1.setValorHora(15.25f);
		
		
		f1.nomeCompleto(args);
		System.out.println(f1.calcularSalario());
		System.out.println(f1.incrementarHoras(horas)); 

	}

}
