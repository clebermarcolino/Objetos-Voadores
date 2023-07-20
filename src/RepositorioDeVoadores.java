import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDeVoadores {
    private List<Voador> voadores = new ArrayList<>();

    public boolean adicionaVoador(Voador voador) {
        return voadores.add(voador);
    }

    public Voador removeVoador(int posicao) {
        return voadores.remove(posicao);
    }

    public void fazVoar(int posicao) {
        voadores.get(posicao).voar();
    }

    public void fazPousar(int posicao) {
        voadores.get(posicao).pousar();

    }

    public void fazPlanar(int posicao) {
        voadores.get(posicao).planar();
    }

    public void fazTodosVoarem() {
        for (Voador voador : voadores) {
            voador.voar();
        }
    }

    public void fazTodosPousarem() {
        for (Voador voador : voadores) {
            voador.pousar();
        }
    }

    public void fazTodosPlanarem() {
        for (Voador voador : voadores) {
            voador.planar();
        }
    }
}
