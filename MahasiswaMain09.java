public class MahasiswaMain09 {
    public static void main(String[] args) {
        Mahasiswa09 mhs1 = new Mahasiswa09();
        mhs1.nama = "Evan Fernanda";
        mhs1.nim = "254107060";
        mhs1.kelas = "SIB-1D";
        mhs1.ipk = 3.8;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SIB-1E");
        mhs1.updateIpk(3.9);
        mhs1.tampilkanInformasi();

        Mahasiswa09 mhs2 = new Mahasiswa09 ("Akmal Javier Osbert", "254107080",  3.50, "SIB-1A");
        mhs2.updateIpk (3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa09 mhsEvan = new Mahasiswa09 ("Evan Fernanda", "254107060", 3.80, "SIB-1D");
        mhsEvan.updateIpk (3.95);
        mhsEvan.tampilkanInformasi();
    }
}