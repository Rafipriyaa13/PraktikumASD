# Laporan Praktikum Algortma St Jobsheet 5 Pemilihan

<h4>Nama : Rafi Priya Nugraha<h4>
<h4>NIM : 254107020120<h4>
<h4>Kelas : TI-1E<h4>

## 2.1 Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan

Hasil code  
 <img alt="Screenshot 2025-10-10 105047" src="images\Screenshot 2026-03-04 204152.png" />
 <img alt="Screenshot 2025-10-10 105047" src="images\Screenshot 2026-03-04 204230.png" />

### Pertanyaan Percobaan 1
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method? Jelaskan!  
2. Apa yang dilakukan oleh kode program berikut?
3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan
konstruktur pada baris program berikut?
4. Apa yang dilakukan oleh kode program berikut?
5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?

### Jawaban Percobaan 1
1. pada class mahasiswa23 hanya memiliki atribut saja,jadi tidak perlu menggunakan keduanya secara sekaligus.Namun OOP yang baik sebaiknya memiliki keduanya.
2. kode ini mendeklarasikan sekaligus menginstansiasi sebuah array bertipe mahasiswa dengan kapasitas 3 elemen.
3. karena pada java sudah terdapat construktor bawaan untuk setiap class yang tidak mendefiniskan konstruktor
4. Membuat objek Mahasiswa baru dan menyimpannya,Lalu mengisi semua atribut objek tersebut(nim,nama,kelas,ipk) dengan nilai yang ditentukan secara langsung.
5. karena keduanya memiliki tugas yang berbeda,Mahasiswa digunakan untuk menyimpan struktur data,Sedangkan MahasiswaDemo digunakan untuk menjalankan program,mengolah,dan menampilkan data.selain itu pemisahan ini dugunakan untuk membuat kode lebih terorganisir.

## Percobaan 2.2: Instansiasi Object, serta Mengakses Atribut dan Method  
Hasil Kode:  
<img alt="Screenshot 2025-10-10 105047" src="images\Screenshot 2026-03-04 223749.png" />

### Pertanyaan Percobaan 2.2
1.Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program
pada langkah no 3.
2.Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama
myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?  

### Jawaban Percobaan 2.2
1. - class Mahasiswa
   <img  alt="Screenshot 2025-10-10 105047" src="images\Screenshot 2026-03-05 000346.png" />  
   - MahasiswaDemo
      <img  alt="Screenshot 2025-10-10 105047" src="images\Screenshot 2026-03-05 000415.png" />  
2. Karena new mahasiswa hanya membuatkan wadah,bukan objek objek didalamnya. 

## Percobaan 3: Membuat Konstruktor
### Pertanyaan Percobaan 3
1.Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk
mendeklarasikan konstruktor berparameter!  
2.  Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program
berikut?   
3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program.
Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!  
4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses
secara berurutan? Jelaskan alasannya!   
5.  Buat object baru dengan nama mhs < NamaMahasiswa > menggunakan konstruktor
berparameter dari class Mahasiswa! 
### Jawaban Percobaan 3
1.<img  alt="Screenshot 2025-10-10 105047" src="images\Screenshot 2026-02-22 161405.png" />  
2. Baris kode tersebut melakukan instansiasi object sekaligus inisialisasi atribut menggunakan konstruktor berparameter.  
3. Ketika konstruktor default dihapus, pemanggilan new mahasiswa23() tanpa parameter tidak dikenali oleh Java.  
4. Method dalam sebuah class bersifat independen, artinya masing-masing method berdiri sendiri dan tidak bergantung pada urutan pemanggilan method lain, kecuali ada ketergantungan logika antar method.  
5. <img  alt="Screenshot 2025-10-10 105047" src="images\Screenshot 2026-02-22 163408.png" />  

## Tugas 1 
Berikut adalah kodenya:  
matakuliah23.java
    <img alt="Screenshot 2025-10-10 105317" src="images/Matkul.png" />
Kode Matakuliahmain23.java: 
<img alt="Screenshot 2025-10-10 105317" src="images/Matkulmain.png" />

## Tugas 2 
Berikut adalah hasil kodenya  
Kode Dosen23.java: 
<img alt="Screenshot 2025-10-10 105317" src="images/dosen23.png" />

Kode Dosenmain23.java
  <img alt="Screenshot 2025-10-10 135651" src="images/dosenmain23.png" />

