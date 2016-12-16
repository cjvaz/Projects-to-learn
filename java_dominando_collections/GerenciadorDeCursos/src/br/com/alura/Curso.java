package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> alunos = new HashSet<>();
	
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
	
	public int getTempoTotal() {
		//int tempoTotal = 0;
		//for (Aula aula : aulas) {
			//tempoTotal += aula.getTempo();
		//}
		//return tempoTotal;
		
		// java 8
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + ", aulas: "+ this.aulas +"]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);		
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(this.alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
}
