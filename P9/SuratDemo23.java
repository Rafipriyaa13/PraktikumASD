package P9;

import java.util.Scanner;

public class SuratDemo23 {
    public static void main(String[] args) {
        StackSurat23 stack = new StackSurat23(10);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=============================");
            System.out.println("   Sistem Surat Izin Prodi   ");
            System.out.println("=============================");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\n--- Terima Surat Izin ---");
                    System.out.print("ID Surat         : ");
                    String id = scan.nextLine();

                    System.out.print("Nama Mahasiswa   : ");
                    String nama = scan.nextLine();

                    System.out.print("Kelas            : ");
                    String kelas = scan.nextLine();

                    char jenis = ' ';
                    while (jenis != 'S' && jenis != 'I' && jenis != 's' && jenis != 'i') {
                        System.out.print("Jenis Izin (S=Sakit / I=Izin): ");
                        String inputJenis = scan.nextLine().trim();
                        if (!inputJenis.isEmpty()) {
                            jenis = Character.toUpperCase(inputJenis.charAt(0));
                        }
                        if (jenis != 'S' && jenis != 'I') {
                            System.out.println("Input tidak valid. Masukkan S atau I.");
                        }
                    }

                    System.out.print("Durasi Izin (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat23 surat = new Surat23(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.printf("\nSurat izin atas nama %s berhasil diterima.%n", nama);
                    break;
                case 2:
                    System.out.println("\n--- Proses Surat Izin ---");
                    Surat23 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari: " + diproses.namaMahasiswa);
                        System.out.println("----------------------------");
                        System.out.println("ID Surat  : " + diproses.idSurat);
                        System.out.println("Nama      : " + diproses.namaMahasiswa);
                        System.out.println("Kelas     : " + diproses.kelas);
                        System.out.println("Jenis     : " + diproses.getLabelJenis());
                        System.out.println("Durasi    : " + diproses.durasi + " hari");
                        System.out.println("----------------------------");
                        System.out.println("Status    : Surat berhasil divalidasi.");
                    }
                    break;
                case 3:
                    System.out.println("\n--- Surat Izin Terakhir ---");
                    Surat23 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("ID Surat  : " + terakhir.idSurat);
                        System.out.println("Nama      : " + terakhir.namaMahasiswa);
                        System.out.println("Kelas     : " + terakhir.kelas);
                        System.out.println("Jenis     : " + terakhir.getLabelJenis());
                        System.out.println("Durasi    : " + terakhir.durasi + " hari");
                    }
                    break;
                case 4:
                    System.out.println("\n--- Cari Surat ---");
                    System.out.print("Nama mahasiswa yang dicari: ");
                    String cari = scan.nextLine();
                    Surat23 hasil = stack.cariSurat(cari);

                    if (hasil != null) {
                        System.out.println("Surat ditemukan!");
                        System.out.println("----------------------------");
                        System.out.println("ID Surat  : " + hasil.idSurat);
                        System.out.println("Nama      : " + hasil.namaMahasiswa);
                        System.out.println("Kelas     : " + hasil.kelas);
                        System.out.println("Jenis     : " + hasil.getLabelJenis());
                        System.out.println("Durasi    : " + hasil.durasi + " hari");
                    } else {
                        System.out.printf("Surat izin atas nama \"%s\" tidak ditemukan.%n", cari);
                    }
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);

        scan.close();
    }
}
