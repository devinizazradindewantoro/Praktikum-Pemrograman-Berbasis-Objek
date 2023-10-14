import java.util.Scanner;

public class LatihanMandiri310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 50; i++) {
            if (i % 3 != 0) {
              System.out.print(i + " ");
            }
        }
    }
}
