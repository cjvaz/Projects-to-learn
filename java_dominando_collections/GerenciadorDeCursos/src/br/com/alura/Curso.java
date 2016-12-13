package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		// retorna uma lista imutável ou read-only
		// isso evita que seja adicionada um novo elemento na lista
		// para fazer isso somente com o metodo adiciona!
		// princípio da Programação defensiva.
		return Collections.unmodifiableList(aulas); 
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
}
