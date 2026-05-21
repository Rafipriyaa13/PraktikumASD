package CM2;
import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("\n======================================");
        System.out.println("SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("======================================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Pesan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu : ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLPembeli antrian = new DLLPembeli();
        DLLPesanan pesanan = new DLLPesanan();
        
        int pilih, kode, harga;
        String nama, noHp, namaPesanan;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    noHp = sc.nextLine();
                    
                    Pembeli pb = new Pembeli(nama, noHp);
                    antrian.tambahAntrian(pb);
                    break;
                    
                case 2:
                    antrian.cetakAntrian();
                    break;
                    
                case 3:
                    NodePembeli hapusData = antrian.hapusAntrian();
                    
                    if (hapusData != null) {
                        System.out.print("Kode Pesanan : ");
                        kode = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Nama Pesanan : ");
                        namaPesanan = sc.nextLine();
                        System.out.print("Harga        : ");
                        harga = sc.nextInt();

                        Pesanan psn = new Pesanan(kode, namaPesanan, harga);
                        pesanan.tambahPesanan(psn);
                        
                        System.out.println(hapusData.data.namaPembeli + " telah memesan " + namaPesanan);
                    }
                    break;
                    
                case 4:
                    pesanan.laporanPesanan();
                    break;
                    
                case 0:
                    System.out.println("Keluar...");
                    break;
                    
                default:
                    System.out.println("Salah pilih menu");
            }
        } while (pilih != 0);
    }
}