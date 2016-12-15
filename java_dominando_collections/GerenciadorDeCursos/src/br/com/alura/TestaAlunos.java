package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Rennan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Alberto Souza");
		
		System.out.println(alunos.size());
		
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos);
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		
		System.out.println("----------------------------------");
		
		System.out.println("Paulo Silveira está matriculado? " + pauloEstaMatriculado);
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println("----------------------------------");
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println(alunosEmLista);
	}

}

