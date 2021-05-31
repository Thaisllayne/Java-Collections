package br.com.alura;

public class TestaBuscaAlunosDoCurso {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java",
				"Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		
		Aluno a1 = new Aluno("Rodrigo Turini", 11111);
		Aluno a2 = new Aluno("Guilherme", 22222);
		Aluno a3 = new Aluno("Paulo", 33333);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o aluno com matricula 22222?");
		Aluno aluno = javaColecoes.buscaMatriculado(22222);
		System.out.println("aluno: " + aluno);
		
	}
	
}
