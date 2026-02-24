import java.util.Scanner;
public class tugas2 {
    static Scanner scanner = new Scanner(System.in);
    static String[][] jadwal;
    static int n;
    static void inputJadwal() {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        n = scanner.nextInt();
        scanner.nextLine();

        jadwal = new String[n][4];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Jadwal ke-" + (i + 1) + " ---");
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = scanner.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = scanner.nextLine();
            System.out.print("Hari Kuliah      : ");
            jadwal[i][2] = scanner.nextLine();
            System.out.print("Jam Kuliah       : ");
            jadwal[i][3] = scanner.nextLine();
        }
    }
    static void tampilSemuaJadwal() {
        System.out.println("\n========================================================");
        System.out.println("              SELURUH JADWAL KULIAH                    ");
        System.out.println("========================================================");
        System.out.printf("%-5s %-20s %-10s %-10s %-12s%n",
                "No", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d %-20s %-10s %-10s %-12s%n",
                    (i + 1), jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
        System.out.println("========================================================");
    }
    static void tampilJadwalByHari() {
        System.out.print("\nMasukkan hari yang dicari: ");
        String hari = scanner.nextLine();

        System.out.println("\n========================================================");
        System.out.println("         JADWAL KULIAH HARI " + hari.toUpperCase());
        System.out.println("========================================================");
        System.out.printf("%-5s %-20s %-10s %-12s%n",
                "No", "Mata Kuliah", "Ruang", "Jam");
        System.out.println("--------------------------------------------------------");

        boolean ditemukan = false;
        int no = 1;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-5d %-20s %-10s %-12s%n",
                        no, jadwal[i][0], jadwal[i][1], jadwal[i][3]);
                no++;
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari " + hari);
        }
        System.out.println("========================================================");
    }
    static void tampilJadwalByMatkul() {
        System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
        String matkul = scanner.nextLine();
        System.out.println("\n========================================================");
        System.out.println("         JADWAL MATA KULIAH: " + matkul.toUpperCase());
        System.out.println("========================================================");
        System.out.printf("%-5s %-10s %-10s %-12s%n",
                "No", "Ruang", "Hari", "Jam");
        System.out.println("--------------------------------------------------------");

        boolean ditemukan = false;
        int no = 1;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.printf("%-5d %-10s %-10s %-12s%n",
                        no, jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                no++;
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah " + matkul + " tidak ditemukan.");
        }
        System.out.println("========================================================");
    }
    public static void main(String[] args) {
        int pilihan;
        inputJadwal();

        do {
            System.out.println("\n===== MENU JADWAL KULIAH =====");
            System.out.println("1. Tampilkan Semua Jadwal");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                tampilSemuaJadwal();
            } else if (pilihan == 2) {
                tampilJadwalByHari();
            } else if (pilihan == 3) {
                tampilJadwalByMatkul();
            } else if (pilihan == 0) {
                System.out.println("Program selesai.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        scanner.close();
    }
}
