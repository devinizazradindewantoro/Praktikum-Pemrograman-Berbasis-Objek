package UJICOBA;
public class TestInheritance2 {
    public static void main(String[] args) {
      Mahasiswa mahasiswa = new Mahasiswa();
      mahasiswa.nama();
      mahasiswa.nim();
      mahasiswa.jurusan();
      mahasiswa.hari();

      System.out.println("                      ");
      MataKuliah matakuliah = new MataKuliah();
      matakuliah.kodeMatkul();
      matakuliah.namaMatkul();

      System.out.println("                      ");
      Ruangan ruangan  = new Ruangan();
      ruangan.namaRuangan();
      
      System.out.println("                      ");
      Dosen dosen = new Dosen();
      dosen.nama();
      dosen.NIP();
    }
}