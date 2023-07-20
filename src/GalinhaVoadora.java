public class GalinhaVoadora implements Voador {
    public void comeMilho() {
        System.out.println("Come milho galinha");
    }

    @Override
    public double voar() {
        System.out.println("Voa voa galinha");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Plana galinha");
    }

    @Override
    public boolean pousar() {
        System.out.println("Pousa galinha");
        return true;

    }
}
