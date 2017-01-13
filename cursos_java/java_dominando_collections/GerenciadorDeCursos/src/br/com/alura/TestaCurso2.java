package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		// a linha abaixo gera erro por causa do unmodifiableList
		// não se deve alterar as aulas da classe, mas deve-se pedir 
		// para a classe uma lista ordenada, ninguém deve alterar.
		//Collections.sort(aulas);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas); //agora sim
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
	}

}
