import java.util.Scanner;

public class Ucapan_21 {
    public static String penerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        System.out.println("Meminta nama orang...");
        return namaOrang;
    }
    
    public static void main(String[] args) {
        String nama = penerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you");
        
    }
}
