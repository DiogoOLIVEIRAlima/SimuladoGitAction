import java.time.LocalDate;
import java.time.LocalDateTime;

public class Evento {
    private int cracha;
    private LocalDate Entrada;
    private LocalDate Saida;

    public Evento(int cracha, LocalDate entrada, LocalDate saida) {
        this.cracha = cracha;
        Entrada = entrada;
        Saida = saida;
    }

    public long getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public LocalDate getEntrada() {
        return Entrada;
    }

    public void setEntrada(LocalDate entrada) {
        Entrada = entrada;
    }

    public LocalDate getSaida() {
        return Saida;
    }

    public void setSaida(LocalDate saida) {
        Saida = saida;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "cracha=" + cracha +
                ", Entrada=" + Entrada +
                ", Saida=" + Saida +
                '}';
    }
}
