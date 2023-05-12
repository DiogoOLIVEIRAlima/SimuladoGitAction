import java.time.LocalDate;
import java.util.ArrayList;

public class Catraca {
    private ArrayList<Evento> eventos;
    public Catraca(){}
    public Catraca(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public void adicionarEvento(int cracha){
        if (!eventos.isEmpty()) {
            int controle = 0;
            for (Evento evento : eventos) {
                if (evento.getCracha() == cracha) {
                    if (evento.getSaida() != null) {
                        Evento evento1 = new Evento(cracha, LocalDate.now(), null);
                        eventos.add(evento1);
                        System.out.println("Bem vindo, acesso liberado");
                        break;
                    } else {
                        evento.setSaida(LocalDate.now());
                        System.out.println("Obrigado pela visita");
                        break;
                    }
                }
                else {
                    controle++;
                }
            }
            if (controle == eventos.size()){
                Evento evento1 = new Evento(cracha, LocalDate.now(), null);
                eventos.add(evento1);
                System.out.println("Bem vindo, acesso Liberado");
            }
        }else {
            Evento evento1 = new Evento(cracha, LocalDate.now(), null);
            eventos.add(evento1);
            System.out.println("Bem vindo, acesso Liberado");
        }
    }
    @Override
    public String toString() {
        return "Catraca{" +
                "eventos=" + eventos +
                '}';
    }
}
