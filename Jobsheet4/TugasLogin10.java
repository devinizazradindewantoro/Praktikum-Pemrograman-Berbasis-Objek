import java.util.Scanner;

public class TugasLogin10 {
    public static void main(String[] args) {
        String usernameBenar = "Devin";
        String passwordBenar = "20040417";

        Scanner Input = new Scanner(System.in);
        System.out.println("Masukkan username: ");
        String usernameInput = Input.nextLine();
        System.out.println("Masukkan password: ");
        String passwordInput = Input.nextLine();

        if (usernameInput.equals(usernameBenar) && passwordInput.equals(passwordBenar) ) {
            System.out.println("Dapat masuk ke system");
        } else {
            System.out.println("username dan password salah");
        }
        Input.close();
    }  

}

