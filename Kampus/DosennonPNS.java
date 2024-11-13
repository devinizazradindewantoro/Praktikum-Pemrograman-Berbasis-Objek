import JS8.Dosen;

public class DosennonPNS extends Dosen {
    
    private int jumlahJamMengajar;

    public void setjumlahJamMengajar (int newValue) {
        jumlahJamMengajar = newValue;
    }

    public void cetakProfil() {
        super.cetakProfil();
        System.out.println("Jumlah Jam Mengajar : " + jumlahJamMengajar + " Jam ");
    }
}
