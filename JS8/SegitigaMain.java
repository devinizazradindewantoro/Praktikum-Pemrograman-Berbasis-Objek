package JS8;
public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
    
        int sisaSudut1 = segitiga.totalSudut(90);
        System.out.println("Sisa sudut dengan satu sudut: " + sisaSudut1);
    
        int sisaSudut2 = segitiga.totalSudut(60, 30);
        System.out.println("Sisa sudut dengan dua sudut: " + sisaSudut2);
    
        int kelilingTigaSisi = segitiga.keliling(3, 4, 5);
        System.out.println("Sisa sudut dengan tiga sisi: " + kelilingTigaSisi);
    
        double kelilingPythagoras = segitiga.keliling(3, 4);
        System.out.println("Sisa sudut dengan sisi Pythagoras: " + kelilingPythagoras);
    }
}