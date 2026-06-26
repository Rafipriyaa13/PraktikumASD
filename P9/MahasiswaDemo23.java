package P9;

import java.util.Scanner;

public class MahasiswaDemo23 {
    public static void main(String[] args) {
        StackTugasMahasiswa23 stack = new StackTugasMahasiswa23(5);
        Scanner scan23 = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1.Mengumpulkan Tugas");
            System.out.println("2.Menilai Tugas");
            System.out.println("3.Melihat Tugas Teratas");
            System.out.println("4.Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            pilih = scan23.nextInt();
            scan23.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan23.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan23.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan23.nextLine();
                    Mahasiswa23 mhs = new Mahasiswa23(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa23 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan23.nextInt();
                        scan23.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        //tambahan percobaan 2
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;

                case 3:
                    Mahasiswa23 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                case 5:
                    Mahasiswa23 pertama = stack.peekBottom();
                    if (pertama != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + pertama.nama
                                + " (NIM: " + pertama.nim + ", Kelas: " + pertama.kelas + ")");
                    }
                    break;
                case 6:
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: "
                            + stack.countTugas() + " tugas");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}