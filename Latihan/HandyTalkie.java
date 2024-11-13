public class HandyTalkie {
    String MerkHT, WarnaHT;
    int Channel, Volume, tambahVolume, kurangiVolume;

    public void menyalakan() {
        System.out.println("Handy Talkie " + MerkHT + " Dinyalakan ");
    }

    public void mematikan() {
        System.out.println("Handy Talkie " + MerkHT + " Dinyalakan ");
    }

    public int tambahVolume (float increment) {
        tambahVolume += increment;
        return tambahVolume;
    }

    public int kurangivVolume (float decrement) {
        kurangiVolume -= decrement;
        return kurangiVolume;
    }

    public void setMerkHT (String newValue) {
        MerkHT = newValue;
    }

    public void setWarnaHT (String newValue) {
        WarnaHT = newValue;
    }

    public void setChannel (int newValue) {
        Channel = newValue;
    }

    public void setVolume (int newValue) {
        Volume = newValue;
    }

    public void cetakSpesifikasi() {
        System.out.println("-----------SPESIFIKASI HANDY TALKIE-----------");
        System.out.println("Merk : " + MerkHT);
        System.out.println("Warna : " + WarnaHT);
        System.out.println("Jumlah Channel : " + Channel + " Channel ");
        System.out.println("Volume : " + Volume);
    }
}
