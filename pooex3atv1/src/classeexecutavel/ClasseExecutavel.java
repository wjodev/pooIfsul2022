package classeexecutavel;

import model.Cliente;
import model.Endereco;
import model.Funcionario;
import model.Empresa;

public class ClasseExecutavel {


	public static void main(String[] args) {
		
		Endereco ed1 = new Endereco ("Rua Paulo Plinio", 123, "Vila Linda", "Belo Horizonte", 'M', "Casa 1", 96400200);
		Endereco ed2 = new Endereco ("Rua Paz e Amor", 123, "Vila Linda", "Belo Horizonte", 'M', "Casa 2", 96400555);
		Endereco ed3 = new Endereco ("Rua dezoito", 531, "industrial", "Belo Horizonte", 'M', "Sede BMW", 96400522);
				
		Cliente c1 = new Cliente("Joao Paulo", 1112223344, 999888777, ed1);

		Funcionario f1 = new Funcionario("Will Smith", "Tecnologia", 118, 22042002, "Analista de Sistemas", ed2);
		
		Empresa emp1 = new Empresa(30302218, "bmwmotors@bmw.com", true, ed3, f1, c1);
		
		System.out.println("\n INFORMAÇÕES EMPRESA 1" +"\n Telefone: " + emp1.getTelefone() + "\n email: " + emp1.getEmail() + "\n Endereço: " + emp1.getEndereco().getNomeRua() + "\n funcionario 1: " + emp1.getFuncionario().getNome() + "\n Cliente 1: " + emp1.getCliente().getNome());
		System.out.println("\n INFORMAÇÕES FUNCIONARIO 1: " + "\n Nome: " +  emp1.getFuncionario().getNome() + "\n Setor: " +  emp1.getFuncionario().getSetor() + "\n Ramal: " +  emp1.getFuncionario().getRamal() + "\n Matricula: " + emp1.getFuncionario().getMatricula() + "\n Cargo: " +  emp1.getFuncionario().getCargo() + "\n Endereço: " +  emp1.getFuncionario().getEndereco().getNomeRua() + " nº" +emp1.getFuncionario().getEndereco().getNumero() + " " + emp1.getFuncionario().getEndereco().getBairro() + " " + emp1.getFuncionario().getEndereco().getCidade() + " CEP: " + emp1.getFuncionario().getEndereco().getCep() );
		System.out.println("\n INFORMAÇÕES CLIENTE 1: " + "\n Nome: " +  emp1.getCliente().getNome() + "\n CPF: " +  emp1.getCliente().getCpf() + "\n Telefone: " + emp1.getCliente().getTelefone() + "\n Endereço: " +  emp1.getCliente().getEndereco().getNomeRua() + " nº" + emp1.getCliente().getEndereco().getNumero() + " " + emp1.getCliente().getEndereco().getBairro() + " " + emp1.getCliente().getEndereco().getCidade() + " CEP: " + emp1.getCliente().getEndereco().getCep() );
		


	}

}
