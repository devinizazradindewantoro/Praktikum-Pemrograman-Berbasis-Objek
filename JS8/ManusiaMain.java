package JS8;

public class ManusiaMain {
    public static void main(String[] args) {
        
        Manusia man = new Manusia();
        man.bernafas();
        man.makan();
        System.out.println("\n");

        Dosen dos = new Dosen();
        dos.bernafas();
        dos.makan();
        dos.lembur();
        System.out.println("\n");

        Mahasiswa mhs = new Mahasiswa();
        mhs.bernafas();
        mhs.makan();
        mhs.tidur();
    }
}