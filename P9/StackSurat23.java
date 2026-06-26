package P9;

public class StackSurat23 {
    Surat23[] stack;
    int size;
    int top;

    public StackSurat23(int size) {
        this.size = size;
        stack = new Surat23[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat23 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public Surat23 pop() {
        if (!isEmpty()) {
            Surat23 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat23 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang masuk.");
            return null;
        }
    }

    public Surat23 cariSurat(String nama) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return stack[i];
            }
        }
        return null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack kosong. Tidak ada surat.");
            return;
        }
        System.out.printf("%-10s %-20s %-8s %-8s %s%n",
                "ID Surat", "Nama Mahasiswa", "Kelas", "Jenis", "Durasi");
        System.out.println("-".repeat(60));
        for (int i = top; i >= 0; i--) {
            System.out.printf("%-10s %-20s %-8s %-8s %d hari%n",
                    stack[i].idSurat,
                    stack[i].namaMahasiswa,
                    stack[i].kelas,
                    stack[i].getLabelJenis(),
                    stack[i].durasi);
        }
        System.out.println();
    }
}