import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        int niltugas, nilkuis, niluts, niluas;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.print("Masukkan Nilai Tugas: ");
        niltugas = dc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        nilkuis = dc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        niluts = dc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        niluas = dc.nextInt();
      if (niltugas < 0 || niltugas > 100 || nilkuis < 0 || nilkuis > 100 || 
            niluts < 0 || niluts > 100 || niluas < 0 || niluas > 100) {
            System.out.println("nilai tidak valid");
        } else {
            double nilAkhir = (0.2 * niltugas) + (0.2 * nilkuis) + (0.3 * niluts) + (0.4 * niluas);
    
    String nilHuruf;
            String keterangan;
            if (nilAkhir > 80 && nilAkhir <= 100) {
                nilHuruf = "A";
            } else if (nilAkhir > 73 && nilAkhir <= 80) {
                nilHuruf = "B+";
            } else if (nilAkhir > 65 && nilAkhir <= 73) {
                nilHuruf = "B";
            } else if (nilAkhir > 60 && nilAkhir <= 65) {
                nilHuruf = "C+";
            } else if (nilAkhir > 50 && nilAkhir <= 60) {
                nilHuruf = "C";
            } else if (nilAkhir > 39 && nilAkhir <= 50) {
                nilHuruf = "D";
            } else {
                nilHuruf = "E";
            }
            if (nilHuruf.equals("A") || nilHuruf.equals("B+") || nilHuruf.equals("B") || 
                nilHuruf.equals("C+") || nilHuruf.equals("C")) {
                keterangan = "LULUS";
            } else {
                keterangan = "TIDAK LULUS";
            }
            System.out.println("\n--- Hasil Akhir ---");
            System.out.println("Nilai Akhir   : " +String.format("%.1f",nilAkhir) );
            System.out.println("Nilai Huruf   : " + nilHuruf);
            System.out.println("Keterangan    : " + keterangan);
        }

}
}
