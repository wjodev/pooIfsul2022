package classeexecutavel;
import model.Notas;
import model.Endereco;
import model.Aluno;
import model.Disciplina;
import model.Curso;
import model.Faculdade;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Notas notas1 = new Notas(6f, 7.2f, 10f, 5.48f);
		Endereco ed1 = new Endereco("Rua 15", 10, "Tamarutaca", "Santos", "SP", "Em frente o bar do zé", 90000500);
		Aluno al1 = new Aluno("Paulo Plinio", 1117773322, "TTT222", ed1, notas1);
		Disciplina d1 = new Disciplina("Matematica", "12ab", al1);
		Curso c1 = new Curso("Contabilidade", "145CL", d1);
		Faculdade f1 = new Faculdade(999888777, "faculdade@gmail.com", ed1, c1);
		
		
	System.out.println("\nNotas do aluno : " +notas1.getNota1() + "\nnota 2: " + notas1.getNota2() +  "\nnota 3: " +  notas1.getNota3() +  "\nnota 4: " + notas1.getNota4());
	System.out.println("\nMedia do aluno " + al1.getNome() + ": " + al1.getNotas().calculaMedia());
	System.out.println("\nSituação do aluno: " + al1.mostraSituacao());
	System.out.println("\nNome dos alunos na disciplina de "+ d1.getNome() + "\nAluno: " + d1.getAluno().getNome());
	System.out.println("\nDisciplinas componentes do curso de " + c1.getNome()+ "\nDisciplinas: " + c1.getDisciplina().getNome());
	System.out.println("\nCursos que existem na Faculdade: " + f1.getCurso().getNome());
		
	}

}
