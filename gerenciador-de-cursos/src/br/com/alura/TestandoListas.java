package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	// usando os m�todos mais comuns

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
		// "para cada string aula dentro de aulas, fa�a:"
		for (String aula : aulas) {
			System.out.println("(for) Aula: " + aula);
		}

		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula � " + primeiraAula);

		for (int i = 0; i < aulas.size(); i++) {
			// nas cole��es, sempre utiliza size no lugar de length
			System.out.println("(for) aula: " + aulas.get(i));
		}

		//outro forEach mais pr�tico:
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
