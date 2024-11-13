package Praktikum;

public class MahasiswaLama extends Mahasiswa {
    
    private int SKS;

    public void setSKS (int newValue) {
        SKS = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("SKS : " + SKS);
    }

}
