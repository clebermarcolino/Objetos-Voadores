public class Arara implements Voador {
    String tipoEspecie;

    public Arara(String tipoEspecie) {
        this.tipoEspecie = tipoEspecie;
    }

    public String getTipoEspecie() {
        return tipoEspecie;
    }

    @Override
    public double voar() {
        System.out.println("voa arára");
        return 0;
    }

    @Override
    public boolean pousar() {
        System.out.println("pousa arára");
        return true;
    }

    @Override
    public void planar() {
        System.out.println("Plana arára");
    }
}
