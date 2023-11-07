import java.util.Scanner;
public class IfKondisi {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan jarak (dalam m) : ");
    Integer mode = input.nextInt();

    if (mode<=5) {
        System.out.print("anda menggunakan melee weapon" );
    }
    else{
        System.out.println("anda menggunakan range weapon" );
    }

    input.close();
    }
    
}
