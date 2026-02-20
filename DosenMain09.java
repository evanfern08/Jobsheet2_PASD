public class DosenMain09 {
    public static void main(String[] args) {

        // Objek dengan konstruktor default
        Dosen09 dsn1 = new Dosen09();
        dsn1.idDosen = "DS001";
        dsn1.nama = "Dr. Budi Santoso";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Algoritma";

        // Objek dengan konstruktor berparameter
        Dosen09 dsn2 = new Dosen09("DS002", "Dr. Siti Rahma", false, 2018, "Basis Data");

        // Menampilkan data awal
        System.out.println("=== DATA DOSEN 1 ===");
        dsn1.tampilInformasi();

        System.out.println("=== DATA DOSEN 2 ===");
        dsn2.tampilInformasi();

        // Mengubah status aktif
        dsn2.setStatusAktif(true);

        // Mengubah bidang keahlian
        dsn1.ubahKeahlian("Kecerdasan Buatan");

        // Menghitung masa kerja
        int masaKerja1 = dsn1.hitungMasaKerja(2025);
        int masaKerja2 = dsn2.hitungMasaKerja(2025);

        System.out.println("\nMasa kerja " + dsn1.nama + " : " + masaKerja1 + " tahun");
        System.out.println("Masa kerja " + dsn2.nama + " : " + masaKerja2 + " tahun");

        // Tampilkan data setelah perubahan
        System.out.println("\n=== DATA SETELAH PERUBAHAN ===");
        dsn1.tampilInformasi();
        dsn2.tampilInformasi();
    }
}