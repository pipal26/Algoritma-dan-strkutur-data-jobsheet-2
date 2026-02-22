public class DosenMain14 {
    public static void main(String[] args) {
        
        Dosen14 dosen1 = new Dosen14();
        dosen1.idDosen = "D001";
        dosen1.nama = "Budi Santoso, S.Kom., M.Kom.";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Rekayasa Perangkat Lunak";

        System.out.println("=== Informasi Dosen 1 ===");
        dosen1.tampilInformasi();
        
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Kecerdasan Buatan");
        int masaKerjaDosen1 = dosen1.hitungMasaKerja(2026);
        System.out.println("Masa kerja Dosen 1: " + masaKerjaDosen1 + " tahun.");
        System.out.println("\n--- Setelah Perubahan Dosen 1 ---");
        dosen1.tampilInformasi();

        Dosen14 dosen2 = new Dosen14("D002", "Siti Aisyah, Ph.D.", false, 2020, "Keamanan Siber");
        
        System.out.println("\n=== Informasi Dosen 2 ===");
        dosen2.tampilInformasi();
        
        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Jaringan Komputer dan Keamanan Siber");
        System.out.println("Masa kerja Dosen 2: " + dosen2.hitungMasaKerja(2026) + " tahun.");
        System.out.println("\n--- Setelah Perubahan Dosen 2 ---");
        dosen2.tampilInformasi();
    }
}