import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input banyaknya elemen
        System.out.print("Masukkan banyaknya elemen: ");
        int banyakElemen = sc.nextInt();

        // Inisialisasi array
        int[] nilai = new int[banyakElemen];

        // Input nilai tiap elemen
        for (int i = 0; i < banyakElemen; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        // Cari nilai tertinggi
        int nilaiTertinggi = nilai[0];
        for (int i = 1; i < banyakElemen; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
        }

        // Cari nilai terendah
        int nilaiTerendah = nilai[0];
        for (int i = 1; i < banyakElemen; i++) {
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }

        // Hitung rata-rata
        int totalNilai = 0;
        for (int i = 0; i < banyakElemen; i++) {
            totalNilai += nilai[i];
        }
        float rataRata = totalNilai / banyakElemen;

        // Output
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Rata-rata: " + rataRata);

        sc.close();
    }
}
