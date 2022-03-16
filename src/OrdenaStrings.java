import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

    public static void main(String[] args) throws Exception {
        List<String> palavras = new ArrayList<>();

        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        Comparator<String> comparador = new ComparadorPorTamanho();
        // Collections.sort(palavras, comparador);
        palavras.sort(comparador);

        // System.out.println(palavras);

        // for (String palavra : palavras) {
        // System.out.println(palavra);
        // }
        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);
    }

}
