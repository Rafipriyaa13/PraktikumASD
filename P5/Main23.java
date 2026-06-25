import java.util.Scanner;
public class Main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen23 listDosen = new DataDosen23();
        int menu;

        do {
            System.out.println("=== MENU PENGELOLAAN DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data Dosen");
            System.out.println("3. Sorting Usia ASC (Termuda ke Tertua)");
            System.out.println("4. Sorting Usia DSC (Tertua ke Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine(); // Clear newline buffer

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kd = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Jenis Kelamin (true=Laki-laki / false=Perempuan): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Masukkan Usia: ");
                    int usia = sc.nextInt();
                    Dosen23 dsnBaru = new Dosen23(kd, nama, jk, usia);
                    listDosen.tambah(dsnBaru);
                    System.out.println("Data dosen berhasil ditambahkan!\n");
                    break;
                case 2:
                    System.out.println("\n=== DATA DOSEN ===");
                    listDosen.tampil();
                    break;
                case 3:
                    listDosen.SortingASC();
                    System.out.println("Data berhasil diurutkan secara ASC (Usia Termuda ke Tertua)!\n");
                    break;
                case 4:
                    listDosen.sortingDSC();
                    System.out.println("Data berhasil diurutkan secara DSC (Usia Tertua ke Termuda)!\n");
                    break;
                case 5:
                    System.out.println("Program selesai dijalankan.");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid. Silakan coba lagi!\n");
            }
        } while (menu != 5);
        
        sc.close();
    }
}