public class Penjualan {

    private String nama;
    private int stok, totalharga, harga, hargaSatuan;

    public void setNama(String newValue) {
        nama = newValue;
    }

    public void setStok(int newValue) {
        stok = newValue;
    }

    public void setHargaSatuan(int newValue) {
        hargaSatuan = newValue;
    }

    public void setHarga(int newValue) {
        harga = stok * hargaSatuan;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public int getharga() {
        return stok * hargaSatuan;
    }

    public void setTotalHarga(int newValue) {
        totalharga = newValue;
    }

    public int getTotalharga() {
        return totalharga = stok * hargaSatuan;
    }

    public void cetakInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("Stok : " + stok);
        System.out.println("Harga Satuan : " + hargaSatuan);
        System.out.println(                               );

    }

}