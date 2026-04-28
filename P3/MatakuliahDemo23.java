package P3;

import java.util.Scanner;

public class MatakuliahDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah23[] arrayOfMatakuliah = new Matakuliah23[3];
        String kode, nama, dummy;
        int sks, jumlahJam;
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode  : ");
            kode = sc.nextLine();
            System.out.print("Nama  : ");
            nama = sc.nextLine();
            System.out.print("SKS   : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam   : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------------------------------------");

            arrayOfMatakuliah[i] = new Matakuliah23(kode, nama, sks, jumlahJam);

        }
        arrayOfMatakuliah[0] = new Matakuliah23();
        arrayOfMatakuliah[0].tambahData("12345", "Algoritma & Struktur Data", 2, 6);
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode    : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama    : " + arrayOfMatakuliah[i].nama);
            System.out.println("SKS    : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam    : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("------------------------------------------------");
        }
    }
}
