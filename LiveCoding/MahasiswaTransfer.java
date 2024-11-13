package LiveCoding;
public class MahasiswaTransfer extends MahasiswaPol {
    public String asalUniversitas;

    MahasiswaTransfer(String nama, String nim, String jurusan, String asalUniversitas) {
        super(nama, nim, jurusan);
        this.asalUniversitas = asalUniversitas;
    }

    public void setAsalUniversitas(String asalUniversitas) {
        this.asalUniversitas = asalUniversitas;
    }

    public String getAsalUniversitas() {
        return asalUniversitas;
    }

    public void info() {
        super.info();
        System.out.println("Asal Universitas : " + this.asalUniversitas);
    }
}
