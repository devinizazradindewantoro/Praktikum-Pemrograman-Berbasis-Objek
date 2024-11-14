public class PenjualanDemo {

    public static void main(String[] args) {

     Penjualan Bolpoint = new Penjualan();
     Bolpoint.setNama("Bolpoint");
     Bolpoint.setStok(10);
     Bolpoint.setHargaSatuan(2000);
     Bolpoint.setTotalHarga(Bolpoint.getTotalharga());
     
     Penjualan Pensil = new Penjualan();
     Pensil.setNama("Pensil");
     Pensil.setStok(10);
     Pensil.setHargaSatuan(1000);
     Bolpoint.setTotalHarga(Pensil.getTotalharga());
     
     Penjualan Penghapus = new Penjualan();
     Penghapus.setNama("Penghapus");
     Penghapus.setStok(10);
     Penghapus.setHargaSatuan(500);
     Bolpoint.setTotalHarga(Penghapus.getTotalharga());
     
      Bolpoint.cetakInformasi();
      Pensil.cetakInformasi();
      Penghapus.cetakInformasi();
    
      int totalPemesanan = Bolpoint.getTotalharga() + Pensil.getTotalharga() + Penghapus.getTotalharga();
      System.out.println("Total Pemesanan Keseluruhan : " + totalPemesanan);

 }
}