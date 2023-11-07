import java.util.Scanner;

public class PemilihanPercobaan110 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int angka;
        System.out.println("Masukkan angka:  ");
        angka = input10.nextInt();

        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka ini adalah " + hasil);

        input10.close();
    }
    
}
