package Praktikum;

public class MahasiswaBaru extends Mahasiswa {
    
    private String MataKuliah;
    private String DosenPengampu;

    public void setMataKuliah(String newValue) {
        MataKuliah = newValue;
    }

    public void setDosenPengampu(String newValue) {
        DosenPengampu = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Mata Kuliah : " + MataKuliah);
        System.out.println("Dosen : " + DosenPengampu);
    }

}
