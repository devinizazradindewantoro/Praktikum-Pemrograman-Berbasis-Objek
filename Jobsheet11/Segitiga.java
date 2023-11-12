import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membaca input dari pengguna dan menyimpannya dalam variabel N.
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        // Memeriksa apakah nilai N minimal 3. Jika tidak, maka program akan mencetak pesan "N minimal harus 3" dan berhenti.
        if (N < 3) {
            System.out.println("N minimal harus 3");
        } 

        // Melakukan perulangan dari 1 sampai N.
        for (int i = 1; i <= N; i++) {
            // Melakukan perulangan dari 1 sampai N - i. Pada setiap iterasi, program akan mencetak spasi.
            for (int j = N; j > i; j--) {
                System.out.print(" ");
            }
            // Melakukan perulangan dari i sampai 1. Pada setiap iterasi, program akan mencetak angka j.
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Mencetak baris baru.
            System.out.println();
        }
        // Menutup objek Scanner.
        sc.close();
        // Mengembalikan kontrol ke sistem operasi.
        return;
    }
}