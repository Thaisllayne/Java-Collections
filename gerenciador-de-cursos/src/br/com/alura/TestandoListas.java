package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	// usando os métodos mais comuns

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		System.out.println(aulas);

		aulas.remove(0);
		System.out.println(aulas);

		// foreach:
		// "para cada string aula dentro de aulas, faça:"
		for (String aula : aulas) {
			System.out.println("(for) Aula: " + aula);
		}

		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é " + primeiraAula);

		for (int i = 0; i < aulas.size(); i++) {
			// nas coleções, sempre utiliza size no lugar de length
			System.out.println("(for) aula: " + aulas.get(i));
		}

		//outro forEach mais prático:
		aulas.forEach(aula -> {
			System.out.println("percorrendo: ");
			System.out.println("Aula " + aula);
		});
		
		aulas.add("Aumentando nosso conhecimento");
		// ordenando o Array
		Collections.sort(aulas);
		System.out.println(aulas);
	}

}
