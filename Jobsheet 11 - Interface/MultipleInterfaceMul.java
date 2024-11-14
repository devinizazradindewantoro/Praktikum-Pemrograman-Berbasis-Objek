package JS10;

public class MultipleInterfaceMul {
    public static void main(String[] args) {
        Rektor paRektor = new Rektor();

        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");

        paRektor.beriSertifikatMawapres(sarjanaCum);
        paRektor.beriSertifikatMawapres(masterCum);
    }
}
