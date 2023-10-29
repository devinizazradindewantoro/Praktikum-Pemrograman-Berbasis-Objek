import java.util.Scanner;

public class ArrayRataNilai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        int[] nilaiMhs = new int[n];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jmlLulus = 0;
        int jmlTidakLulus = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (nilaiMhs[i] >= 70) {
                jmlLulus++;
                totalLulus += nilaiMhs[i];
            } else if (nilaiMhs[i] <= 70) {
                jmlTidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            } else
                break;
        }

        double rataLulus = totalLulus / jmlLulus;
        double rataTidakLulus = totalTidakLulus / jmlTidakLulus;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}
