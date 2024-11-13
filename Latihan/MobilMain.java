public class MobilMain {
    public static void main(String[] args) {
        
        Mobil mbl1 = new Mobil();
        Mobil mbl2 = new Mobil();

        mbl1.setMerkMobil("Toyota");
        mbl1.setWarna("Hitam");
        mbl1.setPlatNomor("N 7467 UI");
        mbl1.setKecepatanMobil(80);
        mbl1.cetakInformasi();

        mbl2.setMerkMobil("Karimun");
        mbl2.setWarna("Putih");
        mbl2.setPlatNomor("W 6294 YP");
        mbl2.setKecepatanMobil(20);
        mbl2.cetakInformasi();
    }
}
