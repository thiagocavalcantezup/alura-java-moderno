import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

    public static void main(String[] args) throws Exception {
        List<String> palavras = new ArrayList<>();

        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        palavras.sort(Comparator.comparing(String::length));

        // Tarefa 03.06
        // palavras.sort(Comparator.comparing(String::hashCode));
        palavras.sort(Comparator.comparing(String::intern));

        palavras.forEach(System.out::println);
    }

}
