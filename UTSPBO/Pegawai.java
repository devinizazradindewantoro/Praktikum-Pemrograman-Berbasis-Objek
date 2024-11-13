public class Pegawai {
    private String noIndukPegawai;
    private String nama;
    int gaji = 100000;

    public void setNoIndukPegawai(String noIndukPegawai) {
        this.noIndukPegawai = noIndukPegawai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoIndukPegawai() {
        return  noIndukPegawai;
    }

    public  String getNama() {
        return nama;
    }

    public void tampilDataPokokPegawai(){
        System.out.println("No Induk Pegawai : " + noIndukPegawai);
        System.out.println("Nama Pegawai : " + nama);
        System.out.println("Gaji Pokok : " + gaji);
    }

}
