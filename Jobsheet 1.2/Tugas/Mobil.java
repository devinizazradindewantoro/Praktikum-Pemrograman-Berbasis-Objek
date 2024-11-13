public class Mobil {
    public String MerkMobil, Warna, PlatNomor;
    public int KecepatanMobil, status;

    public void setMerkMobil (String newValue) {
        MerkMobil = newValue;
    }

    public void setWarna (String newValue) {
        Warna = newValue;
    }

    public void setPlatNomor (String newValue) {
        PlatNomor = newValue;
    }

    public int setKecepatanMobil (int increment) {
        KecepatanMobil += increment;

        if (KecepatanMobil >= 60) {
            System.out.println("Berhenti");
        } else if (KecepatanMobil <= 60) {
            System.out.println("Jalan");
        } else {
            System.out.println(" ");
        }
        return status;
    }

    public void cetakInformasi () {
        System.out.println("---------INFORMASI MOBIL------");
        System.out.println("Merk Mobil : " + MerkMobil);
        System.out.println("Warna : " + Warna);
        System.out.println("Plat Nomor : " + PlatNomor);
        System.out.println("Kecepatan Mobil : " + KecepatanMobil);
        System.out.println("Status : " + status);

    }
}

