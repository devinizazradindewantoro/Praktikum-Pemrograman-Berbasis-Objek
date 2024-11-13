public class Manajer extends Pegawai{
    int tunjanganJabatan;

    public void setTunjanganJabatan(int tunjanganJabatan) {
        this.tunjanganJabatan = tunjanganJabatan;
    }

    public int  getTunjanganJabatan() {
        return this.tunjanganJabatan;
    }

    public int getTotGaji() {
        int totGaji = gaji + tunjanganJabatan;
        return totGaji;
    }

    public void tampilDataManajer() {
        System.out.println("Tunjangan Jabatan : " + tunjanganJabatan);
        System.out.println("Total Gaji : " + (gaji+tunjanganJabatan));
    }

}
