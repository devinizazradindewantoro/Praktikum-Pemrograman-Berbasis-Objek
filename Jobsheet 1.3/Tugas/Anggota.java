public class Anggota {

    private String Nama, KTP;
    private int limitPinjaman, jumlahPinjaman;

    public Anggota(String KTP, String Nama, int limitPinjaman, int jumlahPinjaman) {
        this.KTP = KTP;
        this.Nama = Nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return this.Nama;
    }

    public String getKTP() {
        return this.KTP;
    }

    public int getlimitPinjaman() {
        return this.limitPinjaman;
    }

    public int getjumlahPinjaman() {
        return this.jumlahPinjaman;
    }

    public void pinjam(int jumlah) {
        if (this.jumlahPinjaman + jumlah > this.limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjaman += jumlah;
        }
    }

    public void angsur(int jumlah) {
        if (jumlah < this.jumlahPinjaman * 0.1) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        } else {
            this.jumlahPinjaman -= jumlah;
            System.out.println("Jumlah Angsuran : " + getjumlahPinjaman());
        }
    }
}