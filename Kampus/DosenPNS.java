import JS8.Dosen;

public class DosenPNS extends Dosen{
    
    private double gaji;
    
    public void setGaji (double newValue) {
        gaji = newValue;
    }

    public void cetakProfil() {
        super.cetakProfil();
        System.out.println("Gaji : " + gaji);
    }
}
