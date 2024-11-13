public class Dosen {

    private String namaDosen;
    private String KodeMatkul;
    private String NIP;

    public void setNamaDosen (String newValue) {
        namaDosen = newValue;
    }

    public void setKodeMatkul (String newValue){
        KodeMatkul = newValue;
    }

    public void setNIP (String newValue) {
        NIP = newValue;
    }

    public void cetakProfil() {
        System.out.println("                                ");
        System.out.println("Nama Dosen : " + namaDosen);
        System.out.println("Kode Mata Kuliah : " + KodeMatkul);
        System.out.println("NIP : " + NIP);
    }
}