package LiveCoding;
public class MahasiswaPolMain {
    public static void main(String[] args) {
        MahasiswaPol mhs = new MahasiswaPol("Rizky", "234567789", "Teknologi Informasi");
        mhs.setNama(mhs.getNama());
        mhs.setNim(mhs.getNim());
        mhs.setJurusan(mhs.getJurusan());
        mhs.info();

        System.out.println("---------------------------------------------------");

        MahasiswaReguler mhsreguler = new MahasiswaReguler("Devin", "2341760034", "Teknologi Informasi", 2023);
        mhsreguler.setNama(mhsreguler.getNama());
        mhsreguler.setNim(mhsreguler.getNim());
        mhsreguler.setJurusan(mhsreguler.getJurusan());
        mhsreguler.setTahunMasuk(mhsreguler.getTahunMasuk());
        mhsreguler.info();

        System.out.println("---------------------------------------------------");

        MahasiswaTransfer mhstransfer = new MahasiswaTransfer("John", "12345678910", "Teknologi Informasi", "Politeknik Negeri Medan");
        mhstransfer.setNama(mhstransfer.getNama());
        mhstransfer.setNim(mhstransfer.getNim());
        mhstransfer.setJurusan(mhstransfer.getJurusan());
        mhstransfer.setAsalUniversitas(mhstransfer.getAsalUniversitas());
        mhstransfer.info();
    }
}