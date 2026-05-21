package CM2;

public class DLLPesanan {
    NodePesanan head, tail;
    int size;

    public DLLPesanan() {
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void tambahPesanan(Pesanan p) {
        if (isEmpty()) {
            head = tail = new NodePesanan(null, p, null);
        } else {
            NodePesanan nd = new NodePesanan(tail, p, null);
            tail.next = nd;
            tail = nd;
        }
        size++;
    }

    public void sortPesanan() {
        if (isEmpty() || head.next == null) return;

        boolean swapped;
        NodePesanan tmp;
        do {
            swapped = false;
            tmp = head;
            while (tmp.next != null) {
                if (tmp.data.namaPesanan.compareTo(tmp.next.data.namaPesanan) > 0) {
                    Pesanan t = tmp.data;
                    tmp.data = tmp.next.data;
                    tmp.next.data = t;
                    swapped = true;
                }
                tmp = tmp.next;
            }
        } while (swapped);
    }
    public void laporanPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }

        sortPesanan(); 
        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.println("Kode Pesanan\tNama Pesanan\tHarga");
        
        NodePesanan tmp = head;
        int total = 0;
        
        while (tmp != null) {
            System.out.println(tmp.data.kodePesanan + "\t\t" + tmp.data.namaPesanan + "\t\t" + tmp.data.harga);
            total += tmp.data.harga;
            tmp = tmp.next;
        }
        System.out.println("Total Pendapatan: " + total);
    }
}