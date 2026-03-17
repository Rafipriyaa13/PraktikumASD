# Laporan Praktikum Algortma St Jobsheet 5 Pemilihan

<h4>Nama : Rafi Priya Nugraha<h4>
<h4>NIM : 254107020120<h4>
<h4>Kelas : TI-1E<h4>

## 5.1 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer
Hasil code
 <img alt="Screenshot 2025-10-10 105047" src="images\Screenshot 2026-03-12 093100.png" />
![alt text](<images/Screenshot 2026-03-12 093107.png>)


### Pertanyaan Percobaan 1
1.Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan
perbedaan bagian kode pada penggunaan if dan else!  
2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!  
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !  
4.  Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!   

### Jawaban Percobaan 1
1. Perbedaan if dan else pada faktorialDC: 
 - if (n==1) → Base case: kondisi berhenti rekursi, langsung return 1
 - else → Recursive case: masalah diperkecil dengan memanggil diri sendiri  faktorialDC(n-1) sampai mencapai base case  
2. Apakah bisa diganti selain for? Ya, bisa menggunakan while: 
![alt text](<images/Screenshot 2026-03-12 101610.png>)
3.  Perbedaan fakto *= i vs int fakto = n * faktorialDC(n-1):
 - fakto *= i → Iteratif, mengalikan nilai satu per satu dari loop, tidak ada pemanggilan fungsi
 - int fakto = n * faktorialDC(n-1) → Rekursif, memanggil fungsi dirinya sendiri dengan n dikurangi 1 
4. Kesimpulan:  
 - faktorialBF() bekerja secara iteratif (loop dari 1 sampai n, kalikan satu per satu)  
 - faktorialDC() bekerja secara rekursif (memecah masalah menjadi sub-masalah yang lebih kecil hingga base case)   
## Percobaan 5.2:  Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer
Hasil Kode:
![alt text](<images/Screenshot 2026-03-18 002817.png>)
PangkatMain:
![alt text](<images/Screenshot 2026-03-18 002833.png>)

### Pertanyaan Percobaan 2
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan
dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat,
apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa
jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method
pangkatBF() yang tanpa parameter?
4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!
### Jawaban Percobaan 2
1. Perbedaan pangkatBF() dan pangkatDC()  
pangkatBF(int a, int n) → Menggunakan loop iteratif. Mengalikan a sebanyak n kali secara berurutan. Kompleksitas: O(n).
pangkatDC(int a, int n) → Menggunakan rekursi Divide and Conquer. Membagi eksponen menjadi setengahnya di setiap langkah:  
Jika n genap: a^n = a^(n/2) × a^(n/2)  
Jika n ganjil: a^n = a^(n/2) × a^(n/2) × a  
Kompleksitas: O(log n) — jauh lebih efisien untuk eksponen besar.  
2. tahap combine sudah ada. Ditunjukkan pada baris:  
![alt text](<images/Screenshot 2026-03-18 003736.png>)
3. Method pangkatBF(int a, int n) tetap relevan memiliki parameter karena memungkinkan method digunakan secara fleksibel dengan nilai berbeda-beda.  
4. - pangkatBF(): Melakukan perkalian berulang a × a × a × ... × a sebanyak n kali menggunakan loop. Setiap iterasi mengalikan hasil sementara dengan basis a.
   - pangkatDC(): Membagi pangkat menjadi dua bagian yang sama besar, menyelesaikan masing-masing secara rekursif, lalu menggabungkan hasilnya. Contoh: 2^8 = 2^4 × 2^4, dan 2^4 = 2^2 × 2^2, dst. Ini mengurangi jumlah perkalian secara signifikan.


## Percobaan 3:  Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer
Hasil Code:
![alt text](<images/Screenshot 2026-03-18 004731.png>)
SumMain:
![alt text](<images/Screenshot 2026-03-18 004739.png>)
### Pertanyaan Percobaan 3
1. Kenapa dibutuhkan variable mid pada method TotalDC()?
2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?
3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?
4. Apakah base case dari totalDC()?
5. Tarik Kesimpulan tentang cara kerja totalDC()
### Jawaban Percobaan 3
1. Variabel mid digunakan untuk membagi array menjadi dua bagian yang seimbang (left dan right). Ini adalah inti dari strategi Divide and Conquer.  
2. lsum → hasil penjumlahan setengah kiri array (indeks l sampai mid)  
rsum → hasil penjumlahan setengah kanan array (indeks mid+1 sampai r)
3. tahap Combine: menggabungkan hasil dari dua submasalah (kiri dan kanan) menjadi solusi lengkap. Total seluruh array = total bagian kiri + total bagian kanan.
4. Base case-nya adalah ketika l == r, artinya array hanya memiliki satu elemen. Dalam kondisi ini tidak perlu dibagi lagi, langsung kembalikan nilai elemen tersebut.
![alt text](<images/Screenshot 2026-03-18 010007.png>)
5. totalDC() bekerja dengan strategi Divide and Conquer dalam tiga tahap:  
Divide: Array dibagi dua di titik tengah (mid)  
Conquer: Masing-masing bagian dijumlahkan secara rekursif hingga mencapai base case (1 elemen)  
Combine: Hasil kiri dan kanan dijumlahkan (lsum + rsum)
## Tugas 1 
Berikut adalah kodenya:  
![alt text](<images/Screenshot 2026-03-18 010227.png>)
class main
![alt text](<images/Screenshot 2026-03-18 010240.png>)