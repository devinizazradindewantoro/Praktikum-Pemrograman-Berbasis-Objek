import java.util.Scanner;

public class Pemilihan2Percobaan110 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
         int Tahun;
    
        System.out.println("Masukkan Tahun Kabisat: ");
        Tahun=input10.nextInt();
        

        if ((Tahun % 4) == 0) {
            if ((Tahun % 100) !=0){
                System.out.println("Tahun Kabisat");
            }else{
                System.out.println("Bukan Tahun Kabisat");
            }
        } else 
            System.out.println("Bukan Tahun Kabisat");

    }
}