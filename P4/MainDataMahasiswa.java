public class MainDataMahasiswa {
       public static void main(String[] args) {
        dataMahasiswa[] mhs = {
            new dataMahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new dataMahasiswa("Budi",  "220101002", 2022, 85, 88),
            new dataMahasiswa("Cindy", "220101003", 2021, 90, 87),
            new dataMahasiswa("Dian",  "220101004", 2021, 76, 79),
            new dataMahasiswa("Eko",   "220101005", 2023, 92, 95),
            new dataMahasiswa("Fajar", "220101006", 2020, 88, 85),
            new dataMahasiswa("Gina",  "220101007", 2023, 80, 83),
            new dataMahasiswa("Hadi",  "220101008", 2020, 82, 84)
        };
 
        System.out.println("===== Data Nilai Mahasiswa =====");
        System.out.printf("%-8s %-12s %-12s %-10s %-10s%n",
                "Nama", "NIM", "Tahun Masuk", "Nilai UTS", "Nilai UAS");
        for (dataMahasiswa m : mhs) {
            System.out.printf("%-8s %-12s %-12d %-10d %-10d%n",
                    m.nama, m.nim, m.tahunMasuk, m.nilaiUTS, m.nilaiUAS);
        }
 
        System.out.println();
        System.out.println("a) Nilai UTS tertinggi (Divide and Conquer): "
                + dataMahasiswa.maxUTSDC(mhs, 0, mhs.length - 1));
        System.out.println("b) Nilai UTS terendah  (Divide and Conquer): "
                + dataMahasiswa.minUTSDC(mhs, 0, mhs.length - 1));
        System.out.printf("c) Rata-rata nilai UAS  (Brute Force)       : %.2f%n",
                dataMahasiswa.rataUASBF(mhs));
    }
}
