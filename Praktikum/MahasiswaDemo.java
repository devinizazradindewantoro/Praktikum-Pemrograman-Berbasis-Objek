package Praktikum;

public class MahasiswaDemo {
    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa();
        MahasiswaBaru mhs2 = new MahasiswaBaru();
        MahasiswaLama mhs3 = new MahasiswaLama();

        mhs1.setNama("Andi");
        mhs1.setKelas("TI 1A");
        mhs1.setNim(25417400);
        mhs1.cetakStatus();


        mhs2.setNama("Sofi");
        mhs2.setKelas("SIB 1E");
        mhs2.setNim(24417664);
        mhs2.setMataKuliah("Dasar Pemrograman");
        mhs2.setDosenPengampu("Vivin Ayu Lestari S.Kom, M.Kom");
        mhs2.cetakStatus();

        mhs3.setNama("Bejo");
        mhs3.setKelas("TI 4F");
        mhs3.setNim(19417263);
        mhs3.setSKS(21);
        mhs3.cetakStatus();

    }
}
