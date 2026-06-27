package P10;
public class AntrianKRS23 {

    private Mahasiswa23[] data;
    private int front;
    private int rear;
    private int size;
    private int max;           
    private int maxDilayani;    
    private int jumlahDilayani; 

    public AntrianKRS23(int max, int maxDilayani) {
        this.max            = max;
        this.maxDilayani    = maxDilayani;
        this.data           = new Mahasiswa23[max];
        this.front          = 0;
        this.rear           = -1;
        this.size           = 0;
        this.jumlahDilayani = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void kosongkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong.");
        } else {
            front = 0;
            rear  = -1;
            size  = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        }
    }

    public void tambahAntrian(Mahasiswa23 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambah mahasiswa.");
            return;
        }
        if (jumlahDilayani >= maxDilayani) {
            System.out.println("Kuota DPA sudah penuh (" + maxDilayani + " mahasiswa).");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian KRS.");
    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada mahasiswa yang bisa dipanggil.");
            return;
        }
        System.out.println("=== Memanggil Antrian KRS ===");
        int jumlahDipanggil = Math.min(2, size); 
        for (int i = 0; i < jumlahDipanggil; i++) {
            Mahasiswa23 mhs = data[front];
            front = (front + 1) % max;
            size--;
            jumlahDilayani++;
            System.out.print("Mahasiswa ke-" + jumlahDilayani + " diproses: ");
            mhs.tampilkanData();
            if (jumlahDilayani >= maxDilayani) {
                System.out.println("[INFO] DPA telah mencapai kuota maksimal " + maxDilayani + " mahasiswa.");
                break;
            }
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("=== Daftar Semua Antrian KRS ===");
        System.out.println("NO   NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkan2Terdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("=== 2 Mahasiswa Terdepan dalam Antrian ===");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        int jumlah = Math.min(2, size);
        for (int i = 0; i < jumlah; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang dalam antrian:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahDilayani() {
        return jumlahDilayani;
    }

    public int getJumlahBelumProses() {
        return size;
    }
}