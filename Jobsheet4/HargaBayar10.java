import java.util.Scanner;

public class HargaBayar10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double dis=0.1, total, bayar, jmlDis;

        System.out.println("Masukkan harga barang yang dibeli ");
        int harga = input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
        int jumlah = input.nextInt();
        System.out.println("Masukkan nama merk buku yang dibeli ");
        input.nextLine();
        System.out.println("Masukkan Jumlah halaman buku ");
        input.nextInt();


        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total=jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);

        input.close();
    }   
}