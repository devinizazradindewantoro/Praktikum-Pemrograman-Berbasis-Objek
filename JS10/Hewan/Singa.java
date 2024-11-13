package JS10.Hewan;

class Singa extends Binatang implements IKarnivora {
    private String suara;
    private String warnaBulu;

    public Singa(String nama, int jmlKaki,
            String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Singa memakan daging.");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Saya adalah singa bernama " + nama + ". Saya memiliki " + jmlKaki + " kaki.");
        System.out.println("Suara saya " + suara + " dan bulu saya berwarna " + warnaBulu);
    }
}
