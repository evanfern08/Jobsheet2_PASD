public class Mahasiswa09 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    Mahasiswa09() {
        nama = "";
        nim = "";
        kelas = "";
        ipk = 0.0;
    }

    Mahasiswa09(String nama, String nim, double ipk, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kelas;
    }
        public static void main(String[] args) {

        Mahasiswa09 mhs1 = new Mahasiswa09();
        mhs1.nama = "Evan";
        mhs1.nim = "254107060";
        mhs1.kelas = "SIB-1D";
        mhs1.ipk = 3.8;

        mhs1.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs1.nilaiKinerja());

        System.out.println("---------------------");

        Mahasiswa09 mhs2 = new Mahasiswa09("Akmal", "254107080", 3.5, "SIB-1A");
        mhs2.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs2.nilaiKinerja());
    }

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Baik";
        } else if (ipk >= 2.0) {
            return "Cukup";
        } else {
            return "Kurang";
        }
    }
}