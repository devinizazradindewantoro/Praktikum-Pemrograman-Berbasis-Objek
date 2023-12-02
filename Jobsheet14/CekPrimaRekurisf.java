import java.util.Scanner;
public class CekPrimaRekurisf {
    static int prima (int n, int j){
        if (n == 1 || j == 1){
            System.out.println("Bilangan Prima");
        }else if (n % j != 0){
            return prima(n, j - 1);
        }else if (n % j == 0){
            System.out.println("Bukan Bilangan Prima");
        }
        return (1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int n = sc.nextInt();
        int j = n-1;
        prima(n, j);
        sc.close();
    }
}