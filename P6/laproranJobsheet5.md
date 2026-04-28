# Laporan Praktikum Algortma St Jobsheet 5 Pemilihan

<h4>Nama : Rafi Priya Nugraha<h4>
<h4>NIM : 254107020120<h4>
<h4>Kelas : TI-1E<h4>

## 6.2. Searching/ Pencarian Menggunakan Algoritma Sequential Search
Hasil code
![alt text](images/image2.png)
![alt text](images/image3.png)
![alt text](images/image4.png)
### Pertanyaan Percobaan 1
1.  Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class
MahasiswaBerprestasi!  
2. Jelaskan fungsi break pada kode program di bawah ini!  
![alt text](images/image1.png)
3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?  
4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang
dibuat di atas akan menampilkan data ke berapa? Jelaskan. 
5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari
kode di atas? 

### Jawaban Percobaan 1
1. method tampildatasearch digunakan untuk menampilkan data yang disearch,sedangkan method tampilPosisi digunakan untuk menampilkan pada indeks mana data berada. 
2. break digunakan untuk keluar dari loop ketika data ditemukan,tanpa melanjutkan loop selanjutnya.  
3. digunakan sebagai penanda lokasi indeks dimana data yang dicari ditemukan di array.  
4. data yang pertama kali ditemukan ditampilkan,dikarenakan pada kode terdapat break; maka loop tidak akan dilanjutkan.
5. akan terjadi infinite loop

## 6.3. Searching/ Pencarian Menggunakan Algoritma Binary Search
![alt text](images/image5.png)  


![alt text](images/image6.png)
### Pertanyaan Percobaan 6.3
1.Tunjukkan pada kode program yang mana proses divide dijalankan!  
2. Tunjukkan pada kode program yang mana proses conquer dijalankan!  
3. Apa fungsi left, right, dan mid?  
4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan Mengapa demikian?

### Jawaban Percobaan 2.2
1. -Instansiasi Object
   <img  alt="Screenshot 2025-10-10 105047" src="images\Screenshot 2026-02-20 145936.png" />  
   -Pemberian Nilai Atribut
      <img  alt="Screenshot 2025-10-10 105047" src="images\image.png" />  
   -Pemanggilan Method
         <img  alt="Screenshot 2025-10-10 105047" src="images\Screenshot 2026-02-20 150553.png" />  
2. Menggunakan dot operator (.) yaitu titik setelah nama object.  
3. Karena di antara pemanggilan pertama dan kedua, terdapat perubahan nilai atribut melalui pemanggilan method ubahKelas() dan updateIpk().  


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

