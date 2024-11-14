package JS10;

public class interfacemain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        pakrektor.beriSertifikatCumlaude(masterCumlaude);

        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
    }
}