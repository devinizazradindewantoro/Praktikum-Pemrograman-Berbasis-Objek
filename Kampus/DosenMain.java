import JS8.Dosen;

public class DosenMain {
    public static void main(String[] args) {
        
        Dosen ds1 = new Dosen();
        DosenPNS ds2 = new DosenPNS();
        DosennonPNS ds3 = new DosennonPNS();

        ds1.setNamaDosen("Hendra Pradibta, SE., M.Sc");
        ds1.setKodeMatkul("PAMB35208");
        ds1.setNIP("236849270");
        ds1.cetakProfil();

        ds2.setNamaDosen("Indra Dharma Wijaya, ST., M.MT.");
        ds2.setKodeMatkul("TKTI34738");
        ds2.setNIP("275839538");
        ds2.setGaji(5000000);
        ds2.cetakProfil();

        ds3.setNamaDosen("Meyti Eka Apriyani ST., MT,");
        ds3.setKodeMatkul("JARKOM46838");
        ds3.setNIP("849204030");
        ds3.setjumlahJamMengajar(42);
        ds3.cetakProfil();


    }
}