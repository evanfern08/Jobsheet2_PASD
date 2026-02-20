public class MataKuliahMain09 {
    public static void main(String[] args) {

        // Membuat objek dengan konstruktor default
        MataKuliah09 mk1 = new MataKuliah09();
        mk1.kodeMK = "IF101";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        // Membuat objek dengan konstruktor berparameter
        MataKuliah09 mk2 = new MataKuliah09("IF102", "Basis Data", 2, 4);

        // Menampilkan informasi awal
        System.out.println("=== DATA MATA KULIAH 1 ===");
        mk1.tampilInformasi();

        System.out.println("=== DATA MATA KULIAH 2 ===");
        mk2.tampilInformasi();

        // Mengubah SKS
        mk1.ubahSKS(4);

        // Menambah jam
        mk2.tambahJam(2);

        // Mengurangi jam
        mk2.kurangiJam(3);

        // Menampilkan informasi setelah perubahan
        System.out.println("\n=== DATA SETELAH PERUBAHAN ===");
        mk1.tampilInformasi();
        mk2.tampilInformasi();
    }
}