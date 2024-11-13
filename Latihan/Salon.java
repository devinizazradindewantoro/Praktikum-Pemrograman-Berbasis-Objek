public class Salon {
    String MerkSalon, WarnaSalon;
    int VolumeSalon, tambahVolume, kurangiVolume;

    public void menyalakan() {
        System.out.println("Salon " + MerkSalon + " Dinyalakan ");
    }

    public void mematikan() {
        System.out.println("Salon " + MerkSalon + " Dinyalakan ");
    }

    public int tambahVolume (float increment) {
        tambahVolume += increment;
        return tambahVolume;
    }

    public int kurangivVolume (float decrement) {
        kurangiVolume -= decrement;
        return kurangiVolume;
    }

    public void setMerkSalon (String newValue) {
        MerkSalon = newValue;
    }

    public void setWarnaSalon (String newValue) {
        WarnaSalon = newValue;
    }

    public void setVolumeSalon (int newValue) {
        VolumeSalon = newValue;
    }

    public void cetak(){
        System.out.println("-----------------------");
        System.out.println("Merk : " + MerkSalon);
        System.out.println("Warna : " + WarnaSalon);
        System.out.println("Volume : " + VolumeSalon);
        System.out.println("-------------------------");
    }
}
