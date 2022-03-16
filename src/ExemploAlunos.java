import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploAlunos {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        System.out.println("- Ordenando por número de alunos (asc.)");
        cursos.sort(Comparator.comparingInt(Curso::getAlunos));
        cursos.forEach(System.out::println);

        System.out.println();

        System.out.println("- Filtrando e somando o total");
        int totalAlunos = cursos.stream()
                                .filter(curso -> curso.getAlunos() >= 100)
                                .mapToInt(Curso::getAlunos)
                                .sum();

        System.out.println("total: " + totalAlunos);

        System.out.println();

        // Tarefa 04.03
        System.out.println("- Filtrando cursos com mais de 50 alunos");
        cursos.stream().filter(curso -> curso.getAlunos() > 50).forEach(System.out::println);

        System.out.println();

        // Tarefa 04.04
        System.out.println("- Nomes dos cursos");
        cursos.stream().map(Curso::getNome).forEach(System.out::println);
    }

}
