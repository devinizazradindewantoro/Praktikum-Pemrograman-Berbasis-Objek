public class PrinterMain {
    public static void main(String[] args) {
        
        Printer pr1 = new Printer();

        pr1.menyalakan();
        pr1.mematikan();
        pr1.setMerkPrinter("Cannon");
        pr1.setWarnaPrinter("Abu-abu");
        pr1.setKodeWarnaTinta(664);
        pr1.cetakInformasiPrinter();
    }
}
