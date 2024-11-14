import java.util.Date;

public class BukuMain {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Java", "Andi", 2023, true);
        Anggota anggota1 = new Anggota("Budi", "A001", new Date());

        buku1.setJudul(buku1.getJudul());
        buku1.setPenulis(buku1.getPenulis());
        buku1.setTahunTerbit(buku1.getTahunTerbit());
        
        anggota1.setNama(anggota1.getNama());
        anggota1.setIdAnggota(anggota1.getIdAnggota());
        anggota1.getTanggalDaftar();
        
        buku1.pinjam();
        buku1.kembalikan();
    }
}