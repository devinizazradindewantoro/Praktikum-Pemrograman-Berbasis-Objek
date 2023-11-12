import java.util.Scanner;

public class Persegi {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       // Membaca input dari pengguna dan menyimpannya dalam variabel N.
       System.out.print("Masukkan nilai N = ");
       int N = sc.nextInt();
       
       // Memeriksa apakah nilai N minimal 3. Jika tidak, maka program akan mencetak pesan "N minimal harus 3" dan berhenti.
       if (N < 3){
        System.out.println("N minimal harus 3");
       }

       // Melakukan perulangan dari 1 sampai N.
       for (int i = 1; i <= N; i++){
        // Melakukan perulangan dari 1 sampai N.
        for (int j = 1; j <= N; j++){
            // Jika i atau j sama dengan 1 atau N, maka program akan mencetak angka N. Jika tidak, program akan mencetak spasi.
            if (i == 1 || i == N || j == 1 || j == N) {
                System.out.print(N + " ");
            } else {
                System.out.print("  ");
            }

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
