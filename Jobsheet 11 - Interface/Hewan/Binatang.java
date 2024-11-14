package JS10.Hewan;

abstract class Binatang {
    protected String nama;
    protected int jmlKaki;

    public Binatang(String nama, int jmlKaki) {
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setjmlKaki(int jmlKaki) {
        this.jmlKaki = jmlKaki;
    }

    public int getjmlKaki() {
        return jmlKaki;
    }

    public abstract void displayBinatang();

}
