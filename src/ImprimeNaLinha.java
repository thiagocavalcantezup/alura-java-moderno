import java.util.function.Consumer;

class ImprimeNaLinha implements Consumer<String> {

    Integer count = 1;

    @Override
    public void accept(String str) {
        System.out.println(count++ + " " + str);
    }

}
