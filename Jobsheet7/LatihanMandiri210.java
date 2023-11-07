import java.util.Scanner;

public class LatihanMandiri210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
         
        for (int i =25; i >= 1; i--) {
            sum +=i;
        }
        System.out.println("Hasil penjumlahan deret bilangan dari 25 sampai dengan 1 adalah " + sum);

        sc.close();
  }
}