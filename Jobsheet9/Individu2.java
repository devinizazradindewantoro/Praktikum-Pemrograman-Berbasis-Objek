import java.util.Scanner;

public class Individu2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        
        // Mengisi array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        // Menampilkan isi array secara terbalik
        System.out.print("Isi array terbalik: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}

    

