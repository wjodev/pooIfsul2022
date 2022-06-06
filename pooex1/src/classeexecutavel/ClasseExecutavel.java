package classeexecutavel;

import model.Conta;
import model.Pessoa;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Conta c1 = new Conta();
		
		c1.setCodigo(1234);
		c1.setCorrentista("Pedro");
		c1.setSaldo(1000.00f);
		
		p1.setNome("Joao");
		p1.setIdade(20);
		p1.setCelular(999999);
		p1.setNomeMae("Maria");

		
		System.out.println(p1.getNome());
		System.out.println(p1.getIdade());
		System.out.println(p1.getCelular());
		System.out.println(p1.getNomeMae());
		
		System.out.println(c1.getCodigo());
		System.out.println(c1.getCorrentista());
		System.out.println(c1.getSaldo());
		
	}

}
