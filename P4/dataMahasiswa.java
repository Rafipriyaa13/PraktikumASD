public class dataMahasiswa {
     String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;
 
    dataMahasiswa(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    static int maxUTSDC(dataMahasiswa[] data, int l, int r) {
        if (l == r) {
            return data[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int leftMax  = maxUTSDC(data, l, mid);
        int rightMax = maxUTSDC(data, mid + 1, r);
        return (leftMax > rightMax) ? leftMax : rightMax;
    }
    static int minUTSDC(dataMahasiswa[] data, int l, int r) {
        if (l == r) {
            return data[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int leftMin  = minUTSDC(data, l, mid);
        int rightMin = minUTSDC(data, mid + 1, r);
        return (leftMin < rightMin) ? leftMin : rightMin;
    }
    static double rataUASBF(dataMahasiswa[] data) {
        double total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i].nilaiUAS;
        }
        return total / data.length;
    }
}
