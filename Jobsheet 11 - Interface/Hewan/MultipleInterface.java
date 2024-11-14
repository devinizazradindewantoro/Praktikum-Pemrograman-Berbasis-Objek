package JS10.Hewan;

public class MultipleInterface {
    public static void main(String[] args) {
        // Membuat objek dari kelas Singa
        Singa singa = new Singa("Simba", 4, "Roar", "Kuning");
        
        // Memanggil metode untuk menampilkan informasi tentang singa
        singa.displayBinatang();
        singa.displayMakan();

        System.out.println("-------------------------------------------------------------");

        // Membuat objek dari kelas Gorilla
        Gorilla gorilla = new Gorilla("Koko", 2, "Ugh", "Hitam");
        
        // Memanggil metode untuk menampilkan informasi tentang gorilla
        gorilla.displayBinatang();
        gorilla.displayMakan();

        System.out.println("-------------------------------------------------------------");

        // Membuat objek dari kelas Keledai
        Keledai keledai = new Keledai("Eeyore", 4, "Hee-haw", "Abu-abu");
        
        // Memanggil metode untuk menampilkan informasi tentang keledai
        keledai.displayBinatang();
        keledai.displayMakan();
    }
}
