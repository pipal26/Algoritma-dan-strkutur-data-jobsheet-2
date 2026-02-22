1.	Sebutkan dua karakteristik class atau object!
Memiliki state (Atribut/Properti): Data atau keadaan yang dimiliki oleh sebuah object. Pada kode di atas, state diwakili oleh variabel seperti nama dan ipk.

Memiliki behavior (Method/Perilaku): Tindakan atau fungsi yang dapat dilakukan oleh object tersebut. Pada kode di atas, behavior diwakili oleh fungsi seperti tampilkanInformasi() dan ubahKelas().
2.	Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!
nama (bertipe String)
nim (bertipe String)
kelas (bertipe String)
ipk (bertipe Double)
3.	Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
tampilkanInformasi()
ubahKelas(String kelasBaru)
updateIPK(Double ipkBaru)
nilaiKinerja()
4.	Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
void updateIPK(Double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

5.	Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,  kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?

Cara kerja: Menggunakan struktur percabangan if-else if untuk mengevaluasi nilai atribut ipk mahasiswa.

Kriteria:
ipk >= 3.5 = Sangat Baik
ipk >= 3.0 = Baik
ipk >= 2.5 = Cukup
ipk < 2.5 = Kurang

Return: Mengembalikan tipe data String yang berisi teks predikat kinerja tersebut (contoh: "Kinerja Baik").
6.	Commit dan push kode program ke Github
