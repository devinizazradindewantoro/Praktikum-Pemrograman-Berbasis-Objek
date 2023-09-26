import java.util.Scanner;
public class PemilihanPercobaan210 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        

        System.out.println("Nilai uas    : ");
        float uas = input00.nextFloat();
        System.out.println("Nilai uts    :");
        float uts = input00.nextFloat();
        System.out.println("Nilai kuis   :");
        float kuis = input00.nextFloat();
        System.out.println("Nilai Tugas  :");
        float tugas = input00.nextFloat();
        

        float total = (uas  + uts  + kuis  + tugas) / 4 ;
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message );

    if (total >= 100) {
            System.out.println("Kualifikasi Sangat Baik dengan predikat 'A' ");
          } else if (total >=73) {
            System.out.println("Kualifikasi Lebih dari Baik dengan predikat 'B+' ");
          } else if (total >=65)  {
            System.out.println("Kualifikasi Baik dengan predikat 'B' ");
          } else if (total >=60) {
            System.out.println("Kualifikasi Lebih dari cukup dengan predikat 'C+' ");
          } else if (total >=50) {
            System.out.println("Kualifikasi Cukup dengan predikat 'C' ");
          } else if ( total >=39) {
            System.out.println("Kualifikasi Kurang dengan predikat 'D' ");
          } else {
            System.out.println("Kualifikasi Gagal dengan predikat 'E' ");
          }      
    }
    
}
