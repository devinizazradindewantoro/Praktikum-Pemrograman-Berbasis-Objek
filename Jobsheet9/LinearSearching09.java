import java.util.Scanner;

public class LinearSearching09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen array ke-" + (i + 0) + " : ");
            array[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == key) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Key tidak ditemukan");
        } else {
            System.out.println("Key ada di posisi indeks ke-" + index);
        }
        sc.close();
    }
}

