package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 56617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		// a ideia é não mostrar como o motor funciona, estamos espondo os metdos
		// temos que programar de maneira defensiva, com metodo para
		// adicionar e manda uma lista imutável, então
		// os metodos abaixo estão errado
		//javaColecoes.getAlunos().add(a1);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados");
		javaColecoes.getAlunos().forEach(aluno ->{
			System.out.println(aluno);
		});
		
		System.out.println("O alunos " + a1.getNome() + " está matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini está matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 é equals ao turini? ");
		System.out.println(a1.equals(turini));
		
		// sobrescrevemos o metodo hascode na classe Aluno para o contains do set funcionar
		
		System.out.println(a1.hashCode() == turini.hashCode());
		
		// sempre mudar o equal mude o hashCode
		

	}

}
