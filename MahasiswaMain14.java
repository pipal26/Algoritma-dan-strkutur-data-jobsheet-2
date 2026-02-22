public class MahasiswaMain14 {
    
    public static void main(String[] args) {
        Mahasiswa14 mhs1 = new Mahasiswa14();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "S1 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("S1 2K");
        mhs1.updateIPK(3.60);       
        mhs1.tampilkanInformasi();

        Mahasiswa14 mhs2 = new Mahasiswa14("Siti Aisyah", "2241720172", "S1 2J", 3.20);
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();  

    }
}
