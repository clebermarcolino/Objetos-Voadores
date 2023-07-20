import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Voador[] voadores = new Voador[10];

        Random voadorAleatorio = new Random();

        for(int i = 0; i < 10;i++) {
            int valorAleatorio = voadorAleatorio.nextInt(3);
            Voador novoVoador;

            if(valorAleatorio == 0) {
                novoVoador = new GalinhaVoadora();
            }
            else if(valorAleatorio == 1) {
                novoVoador = new Drone("AirDog"); // tipo de drone
            }
            else {
                novoVoador = new Arara("Arára Azul"); // tipo de espécie de arara
            }

            voadores[i] = novoVoador;
        }

        for(Voador elementoVoador : voadores) {
            elementoVoador.voar(); // 1ª chamada polimórfica
            elementoVoador.planar(); // 2ª chamada polimórfica
            elementoVoador.pousar(); // 3ª chamada polimórfica
        }
    }
}