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
<<<<<<< 9b0bcd7e2183ac73fd506e684e1c6d0d088d55f5
=======
		// princípio da Programação defensiva.
>>>>>>> Java: Dominando as Collections - 3. Relacionamentos com coleções
		return Collections.unmodifiableList(aulas); 
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
}
