public class PemegangSaham extends Manajer{
    public int deviden = 1000;
    public int jumSaham = 10;


    public void setDeviden(int deviden) {
        this.deviden = deviden;
    }

    public void setJumSaham(int jumSaham) {
        this.jumSaham = jumSaham;
    }

    public void tampilDataPemegangSaham() {
        System.out.println("Deviden : " + deviden);
        System.out.println("Jum Saham : " + jumSaham);
        System.out.println("Total Gaji : " + (gaji+tunjanganJabatan+deviden));
    }
}
