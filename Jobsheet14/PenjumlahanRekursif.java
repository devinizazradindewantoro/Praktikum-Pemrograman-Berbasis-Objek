public class PenjumlahanRekursif {
    static int tambah (int n){
        if (n == 0){
            return (0);
        }else {
            return n + tambah(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(tambah(n));
    }
}
