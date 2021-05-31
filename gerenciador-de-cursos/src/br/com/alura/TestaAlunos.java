package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo");
		alunos.add("Alberto");
		alunos.add("Nico");
		alunos.add("Sergio");
		alunos.add("Renan");
		alunos.add("Mauricio");
		
		System.out.println(alunos);
		
		// Utilizando o Set:
		// - não tem garantia da ordem;
		// - não tem como acessar o elemento pela posição;
		// - não aceita elementos repetidos;
		// - pode remover qualquer elemento;
		
		boolean estaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(estaMatriculado);
		
		
		alunos.forEach(aluno->{
			System.out.println(aluno);
		});
		
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		
	}

}
