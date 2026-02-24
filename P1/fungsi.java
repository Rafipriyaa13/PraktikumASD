
import java.util.Scanner;
public class fungsi {

    static String[] namaBunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
    static int[] harga = { 75000, 50000, 60000, 10000 };
    static String[] cabang = { "RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4" };

    static long hitungPendapatan(int[] stokCabang) {
        long total = 0;
        for (int j = 0; j < harga.length; j++) {
            total += stokCabang[j] * harga[j];
        }
        return total;
    }

    static String hitungStatus(long pendapatan) {
        return pendapatan > 1500000 ? "Sangat Baik" : "Perlu Evaluasi";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] stok = new int[cabang.length][namaBunga.length];

        // Input stok
        System.out.println("======================================");
        System.out.println("       Input Stok Bunga Harian        ");
        System.out.println("======================================");

        for (int i = 0; i < cabang.length; i++) {
            System.out.println("\n[ " + cabang[i] + " ]");
            for (int j = 0; j < namaBunga.length; j++) {
                System.out.print("Stok " + namaBunga[j] + ": ");
                stok[i][j] = sc.nextInt();
            }
        }

        // Output laporan
        System.out.println("\n======================================");
        System.out.println("   Laporan Pendapatan RoyalGarden     ");
        System.out.println("======================================");
        System.out.printf("%-15s %-20s %-15s%n", "Cabang", "Pendapatan", "Status");
        System.out.println("--------------------------------------");

        for (int i = 0; i < cabang.length; i++) {
            long pendapatan = hitungPendapatan(stok[i]);
            String status = hitungStatus(pendapatan);
            System.out.printf("%-15s Rp%-18s %-15s%n",
                    cabang[i],
                    String.format("%,d", pendapatan).replace(',', '.'),
                    status);
        }

        System.out.println("======================================");
        sc.close();
    }
}
