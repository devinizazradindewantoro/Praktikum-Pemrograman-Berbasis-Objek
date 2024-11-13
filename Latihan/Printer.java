public class Printer {
    String MerkPrinter, WarnaPrinter;
    int KodeWarnaTinta;

    public void menyalakan() {
        System.out.println("Printer " + MerkPrinter + " Dinyalakan ");
    }

    public void mematikan() {
        System.out.println("Printer " + MerkPrinter + " Dinyalakan ");
    }

    public void setMerkPrinter (String newValue) {
        MerkPrinter = newValue;
    }

    public void setWarnaPrinter (String newValue) {
        WarnaPrinter = newValue;
    }

    public void setKodeWarnaTinta (int newValue) {
        KodeWarnaTinta = newValue;
    }

    public void cetakInformasiPrinter () {
        System.out.println("----------------------------------");
        System.out.println("Merk : " + MerkPrinter);
        System.out.println("Warna : " + WarnaPrinter);
        System.out.println("Kode Warna Tinta : " + KodeWarnaTinta);
    }
}