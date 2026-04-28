package P6;

import java.util.Scanner;

public class MahasiswaDemo23 {
    public static void main(String[] args) {
        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();
        Scanner rafi = new Scanner(System.in);
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke" + (i + 1));
            System.out.print("NIM    : ");
            String nim = rafi.nextLine();
            System.out.print("Nama   : ");
            String nama = rafi.nextLine();
            System.out.print("Kelas  : ");
            String kelas = rafi.nextLine();
            System.out.print("IPK    : ");
            String ip = rafi.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("---------------------------------------------------------------");
            list.tambah(new Mahasiswa23(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        String cariIp = rafi.next(); 
        double cari = Double.parseDouble(cariIp);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("--------------------------------------------------------------------");
        double posisi2 =list.findBinarySearch(cari,0,jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        System.out.println("Menggunakan sequential searching");
        double posisi = list.SequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(posisi, pss);

    }
}
