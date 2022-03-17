import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploAlunos {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        List<Curso> cursosFiltrados;

        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.stream()
              .filter(curso -> curso.getAlunos() >= 100)
              .mapToInt(Curso::getAlunos)
              .average()
              .ifPresent(System.out::println);

        cursos.stream()
              .filter(curso -> curso.getAlunos() >= 100)
              .findAny()
              .ifPresent(System.out::println);

        cursosFiltrados = cursos.stream()
                                .filter(curso -> curso.getAlunos() >= 100)
                                .collect(Collectors.toList());

        System.out.println(cursosFiltrados);

        cursos.stream()
              .collect(Collectors.toMap(Curso::getNome, Curso::getAlunos))
              .forEach((curso, alunos) -> {
                  System.out.println("O curso " + curso + " tem " + alunos + " alunos.");
              });

        // Tarefa 05.04
        Curso primeiroCurso = cursos.stream()
                                    .filter(curso -> curso.getAlunos() > 50)
                                    .findFirst()
                                    .orElse(null);

        System.out.println("Primeiro curso (> 50 alunos): " + primeiroCurso);

    }

}
