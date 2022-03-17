import java.util.Comparator;

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return -1;
        }

        if (str1.length() > str2.length()) {
            return 1;
        }

        return 0;
    }

}
