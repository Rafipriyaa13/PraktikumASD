import java.util.Scanner;

public class Main {

    static void insertionSort(Peminjaman[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Peminjaman key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].denda < key.denda) {
                arr[j + 1] = arr[j];
                j--;
            } 

            arr[j + 1] = key;
        }
    }
  static int findBinarySearch(Peminjaman[] sorted, String cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (sorted[mid].mhs.nim.equals(cari)) {
                return mid;
            } else if (sorted[mid].mhs.nim.compareTo(cari) > 0) {
                return findBinarySearch(sorted, cari, left, mid - 1);
            } else {
                return findBinarySearch(sorted, cari, mid + 1, right);
            }
        }
        return -1;
    }
 
    static void binarySearchNIM(Peminjaman[] listPeminjaman, String nimCari) {
        int n = listPeminjaman.length;

        Peminjaman[] sorted = new Peminjaman[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = listPeminjaman[i];
        }

        for (int i = 1; i < n; i++) {
            Peminjaman key = sorted[i];
            int j = i - 1;
            while (j >= 0 && sorted[j].mhs.nim.compareTo(key.mhs.nim) > 0) {
                sorted[j + 1] = sorted[j];
                j--;
            }
            sorted[j + 1] = key;
        }
 
        int found = findBinarySearch(sorted, nimCari, 0, n - 1);
        if (found == -1) {
            System.out.println("Data peminjaman dengan NIM " + nimCari + " tidak ditemukan.");
        } else {
            System.out.println("Hasil pencarian NIM: " + nimCari);

            int start = found;
            while (start > 0 && sorted[start - 1].mhs.nim.equals(nimCari)) {
                start--;
            }
            for (int i = start; i < n; i++) {
                if (sorted[i].mhs.nim.equals(nimCari)) {
                    sorted[i].tampilPeminjaman();
                } else {
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Mahasiswa[] listMahasiswa = new Mahasiswa[3];
        listMahasiswa[0] = new Mahasiswa("22001", "Andi", "Teknik Informatika");
        listMahasiswa[1] = new Mahasiswa("22002", "Budi", "Teknik Informatika");
        listMahasiswa[2] = new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis");

        Buku[] listBuku = new Buku[4];
        listBuku[0] = new Buku("B001", "Algoritma", 2020);
        listBuku[1] = new Buku("B002", "Basis Data", 2019);
        listBuku[2] = new Buku("B003", "Pemrograman", 2021);
        listBuku[3] = new Buku("B004", "Fisika", 2024);

        Peminjaman[] listPeminjaman = new Peminjaman[5];
        listPeminjaman[0] = new Peminjaman(listMahasiswa[0], listBuku[0], 7);
        listPeminjaman[1] = new Peminjaman(listMahasiswa[1], listBuku[1], 3); 
        listPeminjaman[2] = new Peminjaman(listMahasiswa[2], listBuku[2], 10); 
        listPeminjaman[3] = new Peminjaman(listMahasiswa[2], listBuku[3], 6); 
        listPeminjaman[4] = new Peminjaman(listMahasiswa[0], listBuku[1], 4); 

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===    SISTEM PEMINJAMAN RUANG BACA JTI    ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (int i = 0; i < listMahasiswa.length; i++) {
                        listMahasiswa[i].tampilMahasiswa();
                    }
                    break;
                case 2:
                    System.out.println("\nDaftar Buku:");
                    for (int i = 0; i < listBuku.length; i++) {
                        listBuku[i].tampilBuku();
                    }
                    break;
                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (int i = 0; i < listPeminjaman.length; i++) {
                        listPeminjaman[i].tampilPeminjaman();
                    }
                    break;
                case 4:
                    Peminjaman[] sorted = new Peminjaman[listPeminjaman.length];
                    for (int i = 0; i < listPeminjaman.length; i++) {
                        sorted[i] = listPeminjaman[i];
                    }
                    insertionSort(sorted);
                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    for (int i = 0; i < sorted.length; i++) {
                        sorted[i].tampilPeminjaman();
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.next();
                    binarySearchNIM(listPeminjaman, nim);
                    break;
                case 0:
                    System.out.println("Keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}