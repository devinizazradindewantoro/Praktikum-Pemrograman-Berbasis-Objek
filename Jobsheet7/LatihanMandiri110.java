import java.util.Scanner;

public class LatihanMandiri110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, jenisKelamin;
        int i = 0;

        while (i < 30) {
            System.out.print("Masukkan nama mahasiswa : ");
            nama = sc.nextLine();
            System.out.print("Masukkan jenis kelamin mahasiswa : ");
            jenisKelamin = sc.nextLine();
        
            if (jenisKelamin.equalsIgnoreCase("Perempuan")) {
                System.out.println("Jenis kelamin adalah " + jenisKelamin);
            }

            i++;
        }
    }
}
