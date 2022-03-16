import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {

    public static void main(String[] args) throws Exception {
        List<String> palavras = new ArrayList<>();

        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        palavras.sort((str1, str2) -> Integer.compare(str1.length(), str2.length()));
        palavras.forEach(System.out::println);

        // Tarefa 02.06
        new Thread(() -> System.out.println("Executando um Runnable")).start();
    }

}
