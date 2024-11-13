package Object;
import JS8.Mahasiswa;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();
        Mahasiswa m3 = new Mahasiswa();

        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A\n";

        m2.nim = "063048";
        m2.nama = "John Doe";
        m2.alamat = "Surabaya, Jawa Timur";
        m2.kelas = "2C\n";

        m3.nim = "083027";
        m3.nama = "Alberto Dominique";
        m3.alamat = "Pontianak, Kalimantan Barat";
        m3.kelas = "2F";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();
    }
}
