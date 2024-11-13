public class ProyektorMain {
    public static void main(String[] args) {
        
        Proyektor py1 = new Proyektor();

        py1.menyalakan();
        py1.mematikan();
        py1.tambahVolume(30);
        py1.kurangiBrightness(60);
        py1.kurangiContrast(20);
        py1.tambahKeystone(11);
        py1.setMerk("Epson");
        py1.setBrightness(100);
        py1.setContrast(50);
        py1.setVolume(30);
        py1.setKeystone(0);
        py1.cetakInfo();
    }
}