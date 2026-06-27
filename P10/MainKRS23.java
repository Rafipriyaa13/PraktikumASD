package P10;
import java.util.Scanner;

public class MainKRS23 {

    public static void tampilkanMenu() {
        System.out.println("\n========================================");
        System.out.println("   SISTEM ANTRIAN PERSETUJUAN KRS DPA  ");
        System.out.println("========================================");
        System.out.println(" 1. Tambah Mahasiswa ke Antrian");
        System.out.println(" 2. Panggil Antrian (Proses KRS 2 Mahasiswa)");
        System.out.println(" 3. Tampilkan Semua Antrian");
        System.out.println(" 4. Tampilkan 2 Antrian Terdepan");
        System.out.println(" 5. Tampilkan Antrian Paling Akhir");
        System.out.println(" 6. Jumlah Mahasiswa dalam Antrian");
        System.out.println(" 7. Jumlah yang Sudah Proses KRS");
        System.out.println(" 8. Jumlah yang Belum Proses KRS");
        System.out.println(" 9. Cek Antrian Kosong");
        System.out.println("10. Cek Antrian Penuh");
        System.out.println("11. Kosongkan Antrian");
        System.out.println(" 0. Keluar");
        System.out.println("----------------------------------------");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AntrianKRS23 antrian = new AntrianKRS23(10, 30);
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {

                case 1:
                    System.out.print("NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa23 mhs = new Mahasiswa23(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.panggilAntrian();
                    break;

                case 3: 
                    antrian.tampilkanSemua();
                    break;

                case 4: 
                    antrian.tampilkan2Terdepan();
                    break;

                case 5: 
                    antrian.tampilkanTerakhir();
                    break;

                case 6: 
                    System.out.println("Jumlah mahasiswa dalam antrian : "
                            + antrian.getJumlahAntrian());
                    break;

                case 7: 
                    System.out.println("Jumlah mahasiswa yang sudah proses KRS : "
                            + antrian.getJumlahDilayani());
                    break;

                case 8: 
                    System.out.println("Jumlah mahasiswa yang belum proses KRS  : "
                            + antrian.getJumlahBelumProses());
                    break;

                case 9: 
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian KOSONG.");
                    } else {
                        System.out.println("Antrian TIDAK kosong.");
                    }
                    break;

                case 10: 
                    if (antrian.isFull()) {
                        System.out.println("Antrian PENUH.");
                    } else {
                        System.out.println("Antrian BELUM penuh.");
                    }
                    break;

                case 11: 
                    antrian.kosongkanAntrian();
                    break;

                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}
