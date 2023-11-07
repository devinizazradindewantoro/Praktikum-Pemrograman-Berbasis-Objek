import java.util.Scanner;

public class Individu3 {
    public static void main(String[] args) {
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka antara 1-12: ");
        int input = scanner.nextInt();
        
        if (input >= 1 && input <= 12) {
            String bulan = namaBulan[input - 1];
            System.out.println("Nama bulan : " + bulan);
        } else {
            System.out.println("Input tidak valid. Masukkan angka antara 1-12.");
        }
        scanner.close();
    }
}
