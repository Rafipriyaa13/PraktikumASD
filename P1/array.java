import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String[] namaMK = new String[jumlah];
        double[] bobotSKS = new double[jumlah];
        String[] nilaiHuruf = new String[jumlah];
        double[] nilaiSetara = new double[jumlah];
        double[] nilaiAngka = new double[jumlah]; 

        for (int i = 0; i < jumlah; i++) {
            System.out.print("masukkan nama mata kuliah untuk MK " + (i + 1) + ": ");
            namaMK[i] = sc.nextLine();

            System.out.print("masukkan nilai Angka untuk MK " + namaMK[i] + ": ");
            nilaiAngka[i] = sc.nextDouble(); // ← simpan ke array
            sc.nextLine();

            System.out.print("masukkan Bobot SKS untuk MK " + namaMK[i] + ": ");
            bobotSKS[i] = sc.nextDouble();
            sc.nextLine();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }
        }

        double totalBobot = 0;
        double totalSKS = 0;

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("====================");
        System.out.printf("%-40s %-12s %-12s %-10s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-10.2f%n",
                namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotSKS[i]); 
            totalBobot += nilaiSetara[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }

        double ip = totalBobot / totalSKS;
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("IP : %.2f%n", ip);
    }
}