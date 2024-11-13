public class SalonMain {
    public static void main(String[] args) {
        Salon sl1 = new Salon();

        sl1.menyalakan();
        sl1.mematikan();
        sl1.tambahVolume(30);
        sl1.setMerkSalon("JBL");
        sl1.setWarnaSalon("Biru");
        sl1.setVolumeSalon(100);
        sl1.cetak();
    }
}
