import java.util.Scanner;

public class Individu4 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        int jumlah = 0;
        
        // Mengisi array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            jumlah += array[i];
        }
        
        // Menghitung rata-rata
        double rataRata = (double) jumlah / array.length;
        System.out.println("Rata-rata: " + rataRata);

        scanner.close();
    }
}
