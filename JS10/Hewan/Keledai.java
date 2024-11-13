package JS10.Hewan;

public class Keledai extends Binatang implements IHerbivora {
    private String suara;
    private String warnaBulu;

    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Keledai memakan rumput dan dedaunan.");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Saya adalah keledai bernama " + nama + ". Saya memiliki " + jmlKaki + " kaki.");
        System.out.println("Suara saya " + suara + " dan bulu saya berwarna " + warnaBulu);
    }
}
