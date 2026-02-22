1.	Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
public Mahasiswa14(String nm, String nim, String kls, Double ipk) {
        nama = nm;
        this.nim = nim;
        kelas = kls;
        this.ipk = ipk;
    }
2.	Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut? 
Mahasiswa14 mhs2 = new Mahasiswa14("Annisa Nabila", "2141720160", "TI 2L", 3.25);
  Baris program tersebut melakukan instansiasi (pembuatan object baru) bernama mhs2 dari class Mahasiswa14 menggunakan konstruktor berparameter. Sekaligus pada saat yang bersamaan, baris tersebut langsung mengisi (menginisialisasi) nilai awal atribut object mhs2
3.	Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
Program akan mengalami error kompilasi (tidak bisa di-run). Jika menghapus konstruktor default (konstruktor kosong) dari class Mahasiswa14, maka baris kode Mahasiswa14 mhs1 = new Mahasiswa14(); di dalam MahasiswaMain menjadi tidak valid.
4.	Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya!
Tidak harus berurutan. Method di dalam sebuah class dapat dipanggil kapan saja sesuai dengan alur logika atau kebutuhan program.
5.	Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class Mahasiswa!
6.	Commit dan push kode program ke Github
