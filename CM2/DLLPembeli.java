package CM2;

public class DLLPembeli {
    NodePembeli head, tail;
    int size;
    int noUrut;

    public DLLPembeli() {
        head = null;
        tail = null;
        size = 0;
        noUrut = 1;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(Pembeli p) {
        if (isEmpty()) {
            head = tail = new NodePembeli(null, p, noUrut, null);
        } else {
            NodePembeli nd = new NodePembeli(tail, p, noUrut, null);
            tail.next = nd;
            tail = nd;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + noUrut);
        noUrut++;
        size++;
    }

    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("======================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("======================================");
        System.out.println("No Antrian\tNama\t\tNo HP");
        
        NodePembeli tmp = head;
        while (tmp != null) {
            System.out.println(tmp.noAntrian + "\t\t" + tmp.data.namaPembeli + "\t\t" + tmp.data.NoHp);
            tmp = tmp.next;
        }
    }

    public NodePembeli hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        NodePembeli tmp = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return tmp;
    }
}