import java.util.Scanner;
import java.util.Arrays;

public class Porseni2024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] olahraga = {"Badminton", "Tenis Meja", "Basket", "Sepak Bola", "Voly"};
        int[] atlet = {5, 5, 5, 5, 5};

        String[][] cabor = new String[5][];
        for (int i = 0; i < cabor.length; i++) {
            cabor[i] = new String[atlet[i]];
        }

        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Cabang Olahraga " + olahraga[i]);
            for (int j = 0; j < cabor[i].length; j++) {
                System.out.print("Atlet ke-" + (j + 1) + ": ");
                cabor[i][j] = sc.nextLine();
            }
            System.out.println();
        }

        
        for (int i = 0; i < cabor.length; i++) {
            Arrays.sort(cabor[i]);
        }


        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Cabang Olahraga " + olahraga[i]);
            for (int j = 0; j < cabor[i].length; j++) {
                System.out.println(cabor[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}