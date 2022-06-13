package classeexecutavel;

import model.Conta;
import model.Pessoa;
import model.Endereco;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Endereco ed1 = new Endereco();
		
		ed1.setNomeRua("Rua da Quebrada");
		ed1.setNumero(179);
		ed1.setBairro("São Judas");
		
		
		Pessoa p1 = new Pessoa("José", 32, 99887766, ed1);
		Pessoa p2 = new Pessoa("Maria", 18, 99112233, ed1);
		
		Conta c1 = new Conta(p2, 112233,10570.97f);
		Conta c2 = new Conta(p2, 998877, 450000f);
		
		/*
		p1.setNome("José");
		p1.setIdade(32);
		p1.setCelular(999887766);
		p1.setEndereco("Rua da Quebrada");
		
		p2.setNome("Maria");
		p2.setIdade(18);
		p2.setCelular(99112233);
		p2.setEndereco("Rua das Cocotinhas");
		
		c1.setCodigo(112233);
		c1.setSaldo(10570.97f);
		c1.setCorrentista(p1);*/
	
		System.out.println(c2.getCodigo());
		System.out.println(c2.getCorrentista().getEndereco().getBairro());
		
		/*	
		c2.setCodigo(998855);
		c2.setSaldo(500f);
		c2.setCorrentista(p2);
		
		
		
		
	
		System.out.println(p1.getNome());
		System.out.println(p1.getIdade());
		System.out.println(p1.getCelular());
		System.out.println(p1.getEndereco());
		
		System.out.println(c1.getCodigo());
		System.out.println(c1.getCorrentista().getEndereco());
		System.out.println(c1.getSaldo());
		*/
		
	}
   
}
