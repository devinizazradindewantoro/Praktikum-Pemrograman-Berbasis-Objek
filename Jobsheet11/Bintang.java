import java.util.Scanner;

public class Bintang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membaca input dari pengguna dan menyimpannya dalam variabel N.
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        // Memeriksa apakah nilai N minimal 5. Jika tidak, maka program akan mencetak pesan "N minimal harus 5" dan berhenti.
        if (N < 5){
            System.out.println("N minimal harus 5");
        }

        // Melakukan perulangan dari N sampai 1. Pada setiap iterasi, program akan mencetak bintang sebanyak i. Setelah mencetak bintang.
        for(int i = N; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // program akan mencetak baris baru.
            System.out.println();
        }
        // Menutup objek Scanner.
        sc.close();
        // Mengembalikan kontrol ke sistem operasi.
        return;
    }
}
