import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Catraca catraca = new Catraca(new ArrayList<>());
        int cont = 0;
        while (cont < 5){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Passa o cracha aí");
            int resposta = teclado.nextInt();
            catraca.adicionarEvento(resposta);
            cont++;
        }
    }
}