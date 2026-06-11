package P14;

public class BinaryTreeArray23 {
    Mahasiswa23[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray23() {
        this.dataMahasiswa = new Mahasiswa23[10];
    }

    void populateData(Mahasiswa23[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInfomasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
    public void add(Mahasiswa23 data) {
        if (dataMahasiswa[0] == null) {
            dataMahasiswa[0] = data;
            idxLast = 0;
            return;
        }
        
        int currentIdx = 0;
        while (true) {
            if (data.ipk < dataMahasiswa[currentIdx].ipk) {
                int leftIdx = 2 * currentIdx + 1;
                if (leftIdx >= dataMahasiswa.length) {
                    System.out.println("Kapasitas array penuh, gagal menambah data " + data.nama);
                    return;
                }
                if (dataMahasiswa[leftIdx] == null) {
                    dataMahasiswa[leftIdx] = data;
                    if (leftIdx > idxLast) idxLast = leftIdx;
                    break;
                } else {
                    currentIdx = leftIdx;
                }
            } else {
                int rightIdx = 2 * currentIdx + 2;
                if (rightIdx >= dataMahasiswa.length) {
                    System.out.println("Kapasitas array penuh, gagal menambah data " + data.nama);
                    return;
                }
                if (dataMahasiswa[rightIdx] == null) {
                    dataMahasiswa[rightIdx] = data;
                    if (rightIdx > idxLast) idxLast = rightIdx;
                    break;
                } else {
                    currentIdx = rightIdx; 
                }
            }
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInfomasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
