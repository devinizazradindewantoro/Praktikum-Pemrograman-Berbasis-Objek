import java.util.Scanner;
public class Percobaan621 {
    static int hitungLuas (int pjg, int lb){
        int Luas=pjg*lb;
        
        return Luas;

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int p,l,t,L,vol;

    System.out.println("Masukkan panjang");
    p=sc.nextInt();
    System.out.println("Masukkan lebar");
    l=sc.nextInt();
    System.out.println("Masukkan tinggi");
    t=sc.nextInt();

    L=p*l;
    System.out.println("Luas persegi panjang adalah "+L);

    vol=p*l*t;
    System.out.println("Volume balok adalah "+vol);

    sc.close();
    }
}
