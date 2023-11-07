import java.util.Scanner;

public class NestedLoop_2341760034 {
    private static int i;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] temps = new int[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int[] temp : temps) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (int t : temp) {
                System.out.print(t + " ");
            }
            System.out.println();
        }
        // Hitung nilai rata-rata masing-masing kota
        double[] cityAvgTemps = new double[temps.length];
        for (int i = 0; i < temps.length; i++) {
            double cityAvgTemp = 0;
            for (int j = 0; j < temps[i].length; j++) {
                cityAvgTemp += temps[i][j];
            }
            cityAvgTemps[i] = cityAvgTemp / temps[i].length;
        }

        // Tampilkan nilai rata-rata masing-masing kota
        System.out.println("Nilai rata-rata suhu masing-masing kota:");
        for (int i = 0; i < cityAvgTemps.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + ": " + cityAvgTemps[i]);
        }

        sc.close();
    }
}