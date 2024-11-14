public class PersegiPanjang {
    public int panjang, lebar;

    public void getPanjang (int newValue) {
        panjang = newValue;
    }

    public void getLebar (int newValue) {
        lebar = newValue;
    }

    public int getLuas() {
        return panjang * lebar;
    }

    public int getKeliling() {
        return 2 * (panjang + lebar);
    }

    public void displayInformasi() {
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar : " + lebar);
        System.out.println("Luas Persegi Panjang : " + getLuas());
        System.out.println("Keliling Persegi Panjang : " + getKeliling());
    }
}