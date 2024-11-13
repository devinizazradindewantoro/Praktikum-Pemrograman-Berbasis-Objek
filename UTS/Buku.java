public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean status;

    Buku(String judul, String penulis, int tahunTerbit, boolean status) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.status = status;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setTahunTerbit(int tahun) {
        this.tahunTerbit = tahunTerbit;
    }

    public int  getTahunTerbit() {
        return tahunTerbit;
        }


    public boolean getStatus() {
        return status;
    }

    public void pinjam() {
        if (!status) {
            status = true;
            System.out.println("Buku " + judul + " berhasil dipinjam.");
        } else {
            System.out.println("Buku " + judul + " sudah dipinjam.");
        }
    }

    public void kembalikan() {
        if (status) {
            status = false;
            System.out.println("Buku " + judul + " berhasil dikembalikan.");
        } else {
            System.out.println("Buku " + judul + " belum pernah dipinjam.");
        }
    }
}