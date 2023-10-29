public class Individu1 {
    public static void main(String[] args) {
        int[] array = new int[60];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        
        // Tampilkan isi array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
