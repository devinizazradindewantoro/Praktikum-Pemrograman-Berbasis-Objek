package LiveCoding;
public class MahasiswaReguler extends MahasiswaPol {
    public int tahunMasuk;

    MahasiswaReguler(String nama, String nim, String jurusan, int tahunMasuk) {
        super(nama, nim, jurusan);
        this.tahunMasuk = tahunMasuk;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void info() {
        super.info();
        System.out.println("Tahun Masuk : " + this.tahunMasuk);
    }
}
