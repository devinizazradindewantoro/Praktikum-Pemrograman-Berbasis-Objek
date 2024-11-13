package JS10.Hewan;

class Gorilla extends Binatang implements IKarnivora, IHerbivora {
    private String suara;
    private String warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Gorilla memakan buah-buahan dan daun.");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Saya adalah gorilla bernama " + nama + ". Saya memiliki " + jmlKaki + " kaki.");
        System.out.println("Suara saya " + suara + " dan bulu saya berwarna " + warnaBulu);
    }
}
