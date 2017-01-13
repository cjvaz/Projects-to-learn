import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .map(c -> c.getAlunos())
		   .forEach(x -> System.out.println(x));
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 100)
		   .map(Curso::getAlunos)
		   .forEach(System.out::println);
		
		// Em uma única linha de código, pegamos todos os cursos,
		// filtramos os que tem mais de 100 e somamos todos os alunos.
		int soma = cursos.stream()
				   .filter(c -> c.getAlunos() > 100)
				   .mapToInt(Curso::getAlunos)
				   .sum();
		
	}

}
