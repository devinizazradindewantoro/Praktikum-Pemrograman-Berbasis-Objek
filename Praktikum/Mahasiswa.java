package Praktikum;

public class Mahasiswa {
    
    private String nama;
    private String kelas;
    private int nim;

    public void setNama (String newValue) {
        nama = newValue;
    }

    public void setKelas (String newValue) {
        kelas = newValue;
    }

    public void setNim (int newValue) {
        nim = newValue;
    }

    public void cetakStatus() {
        System.out.println("                ");
        System.out.println("Nama : " + nama);
        System.out.println("kelas : " + kelas);
        System.out.println("NIM : " + nim);
        
    }

}
