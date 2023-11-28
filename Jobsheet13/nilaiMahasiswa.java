import java.util.Scanner;

public class nilaiMahasiswa {
    static String[][] jml;
    static int jumlahMahasiswa;
    static int jumlahTugas;

    public static void main(String[] args) {
        inputJumlahMahasiswaTugas();
        input();
        tampilan();
        int hariNilaiTertinggi = nilaiTertinggi();
        tampilNilaiTertinggi(hariNilaiTertinggi);
    }

    static void inputJumlahMahasiswaTugas() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        jumlahTugas = sc.nextInt();

        jml = new String[jumlahMahasiswa][jumlahTugas];
        sc.close();
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < jml.length; i++) {
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = sc.next();
            System.out.println((i + 1) + ". " + nama);

            for (int j = 0; j < jml[0].length; j++) {
                System.out.print("minggu ke-" + (j + 1) + ": ");
                jml[i][j] = sc.next();
            }
            System.out.println();
        }
        sc.close();
    }

    static void tampilan() {
        String[] minggu = { "Minggu 1", "Minggu 2", "Minggu 3", "Minggu 4", "Minggu 5",
                "Minggu 6", "Minggu 7" };

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-15s |", "Nama Mahasiswa");
        for (String m : minggu) {
            System.out.printf("| %-15s |", m);

        }
        System.out.println("\n-----------------------------------------------------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.printf("| %-15s |", "Mahasiswa " + (i + 1));
            for (int j = 0; j < 7; j++) {
                System.out.printf("| %-15s |", jml[i][j]);

            }
            System.out.println("\n-------------------------------------------------------------------------------------------------");

        }
    }

    static int nilaiTertinggi() {
        int[] totalNilaiPerHari = new int[jml[0].length];
        for (int i = 0; i < jml[0].length; i++) {
            int totalNilai = 0;
            for (int j = 0; j < 5; j++) {
                totalNilai += Integer.parseInt(jml[j][i]);
            }
            totalNilaiPerHari[i] = totalNilai;
        }
        int highestDayIndex = 0;
        for (int i = 1; i < totalNilaiPerHari.length; i++) {
            if (totalNilaiPerHari[i] > totalNilaiPerHari[highestDayIndex]) {
                highestDayIndex = i;
            }
        }
        return highestDayIndex;
    }

    static void tampilNilaiTertinggi(int hariTertinggi) {

        System.out.println("\n---------------------------------------------------------------------------------------------------");
        System.out.println("Mahasiswa dengan nilai tertinggi: ");

        int nilaiTertinggi = Integer.MIN_VALUE;
        int mahasiswaTertinggi = 0;

        for (int i = 0; i < jml.length; i++) {
            int nilaiMahasiswa = Integer.parseInt(jml[i][hariTertinggi]);
            System.out.println(
                    "Mahasiswa " + (i + 1) + ": " + nilaiMahasiswa + " (Minggu ke- " + (hariTertinggi + 1) + ")");

            if (nilaiMahasiswa > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa;
                mahasiswaTertinggi = i;
            }
        }
        System.out.println("\nMahasiswa dengan nilai tertinggi adalah: Mahasiswa " + (mahasiswaTertinggi + 1)
                + " dengan nilai " + nilaiTertinggi + " pada minggu ke-" + (hariTertinggi + 1));
    }
}
