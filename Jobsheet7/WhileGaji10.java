import java.util.Scanner;

public class WhileGaji10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = input10.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.println("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = input10.next();
            System.out.println("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = input10.nextInt();
            //i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("INVALID");
                break;
            }
                

            totalGajiLembur += gajiLembur;

        }
        i++;
        System.out.println("Total gaji lembur: " + totalGajiLembur);

        input10.close();
    }
    
}
