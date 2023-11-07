import java.util.Scanner;

public class DoWhileCuti10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = input10.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)");
            konfirmasi = input10.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = input10.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti = jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    break;
                }
            }else{
                break;
            }
        } while (jatahCuti > 0);
        input10.close();
    }
}
