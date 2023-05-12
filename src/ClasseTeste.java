import java.util.ArrayList;

public class ClasseTeste {
    public static void main(String[] args) {
        Catraca catraca = new Catraca(new ArrayList<>());
        System.out.println("Adicionando o cracha na catraca");
        catraca.adicionarEvento(1);
        System.out.println(catraca);
        catraca.adicionarEvento(1);
        System.out.println(catraca);
    }
}
