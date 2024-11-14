package Object;
public class Mahasiswa {
    public String nim;
    public String nama;
    public String alamat;
    public String kelas;

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void displayBiodata(){
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Alamat       : " + alamat);
        System.out.println("Kelas        : " + kelas);
    }
}