package Jobsheet8;
import java.util.Scanner;

public class PraktikumDasarpemrograman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi
        float rataRata = 0;
        //Input
        System.out.println("Masukkan Jumlah Calon mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();
        for(int i =1; i <= jumlahMahasiswa ; i++){

            System.out.println("Calon Mahasiswa " + i + " : ");
            
            System.out.println("Pilihan jurusan - IPA , IPS , BAHASA");
            String jurusan = sc.nextLine();
            System.out.println("Masukkan jurusan : ");
            jurusan = sc.nextLine();
            System.out.print("Masukkan nilai Matematika : ");
            int Matematika = sc.nextInt();
            System.out.print("Masukkan nilai Fisika : ");
            int Fisika = sc.nextInt();
            System.out.print("Masukkan nilai Bahasa Inggris : ");
            int Inggris = sc.nextInt();
            System.out.print("Masukkan nilai Bahasa Indonesia : ");
            int Indonesia = sc.nextInt();
          
            
            if (jurusan.equals("IPA") || jurusan.equals("IPS")) {
                if (rataRata < 80) 
                    System.out.println(" Selamat anda lolos seleksi di prodi D4 TI ");
                else if (rataRata > 80)
                    System.out.println(" Tetap semangat ");
                else 
                    System.out.println("");
            //}else if (jurusan.equalsIgnoreCase("IPS")) {
               //if (rataRata < 80)
                 // System.out.println(" Selamat anda lolos seleksi di prodi D4 TI ");
                //else if (rataRata > 80)
                    //System.out.println(" Tetap semangat ");
            }else if (jurusan.equalsIgnoreCase("BAHASA")) {
                if (rataRata < 80)
                    System.out.println(" Selamat anda lolos seleksi di prodi D3 MI ");
                else if (rataRata > 70)
                    System.out.println(" Tetap semangat "); 
            }else 
                System.out.println("Jurusan tidak valid");

                //Output
                float total  =  (Matematika + Fisika + Inggris + Indonesia) /4 ;
                System.out.println("Rata rata dari nilai keseluruhan adalah : " + total);
        }        
        sc.close();
    }
}
    

