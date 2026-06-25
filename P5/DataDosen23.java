public class DataDosen23 {
    Dosen23[] dataDosen = new Dosen23[10];
    int idx = 0;

    void tambah(Dosen23 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Kapasitas data sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Data dosen masih kosong.");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    // Mengurutkan dari termuda ke tertua menggunakan Bubble Sort
    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen23 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = temp;
                }
            }
        }
    }

    // Mengurutkan dari tertua ke termuda menggunakan Selection Sort
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen23 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
}