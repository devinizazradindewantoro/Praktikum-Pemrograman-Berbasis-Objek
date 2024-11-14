import java.util.Date;

public class Anggota {
    private String nama;
    private String idAnggota;
    private Date tanggalDaftar;

    Anggota(String nama, String idAnggota, Date tanggalDaftar) {
        this.nama = nama;
        this.idAnggota = idAnggota;
        this.tanggalDaftar = tanggalDaftar;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setIdAnggota(String id) {
        this.idAnggota = idAnggota;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public Date getTanggalDaftar() {
        return tanggalDaftar;
    }

    
}
