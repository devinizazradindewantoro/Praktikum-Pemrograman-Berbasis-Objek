public class PenjualanDemo {

    public static void main(String[] args) {

    Penjualan Bolpoint = new Penjualan();
    Bolpoint.setNama("Bolpoint");
    Bolpoint.setStok(10);
    Bolpoint.setHargaSatuan(2000);
    
     
    Penjualan Pensil = new Penjualan();
    Pensil.setNama("Pensil");
    Pensil.setStok(10);
    Pensil.setHargaSatuan(1000);
     
     
    Penjualan Penghapus = new Penjualan();
    Penghapus.setNama("Penghapus");
    Penghapus.setStok(10);
    Penghapus.setHargaSatuan(500);
    
    int totalPemesanan = Bolpoint.getTotalharga() + Pensil.getTotalharga() + Penghapus.getTotalharga();
    System.out.println("Total Pemesanan Keseluruhan : " + totalPemesanan);

 }
}