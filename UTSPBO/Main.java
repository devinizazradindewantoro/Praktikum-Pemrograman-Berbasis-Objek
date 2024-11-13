public class Main {
    public static void main(String[] args) {
        PemegangSaham pemegangSaham = new PemegangSaham();
        pemegangSaham.setNoIndukPegawai("001");
        pemegangSaham.setNama("Drogba");
        pemegangSaham.tampilDataPokokPegawai();
        pemegangSaham.setTunjanganJabatan(50000);
        pemegangSaham.tampilDataManajer();
        pemegangSaham.tampilDataPemegangSaham();
    }
}
