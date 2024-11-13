package Tugas6;

public class KendaraanMain {
    public static void main(String[] args) {
        
        Kendaraan kendaraan =  new Kendaraan();
        kendaraan.kecepatan();
        
        Mobil  mobil = new Mobil();
        mobil.kecepatan();
        mobil.warna();
    
        Mobil  motor = new Mobil();
        motor.kecepatan();
        motor.warna();
    
        Mobil becak = new Mobil();
        becak.kecepatan();
        becak.warna();
    }

}
