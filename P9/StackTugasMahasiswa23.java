package P9;

public class StackTugasMahasiswa23 {
    Mahasiswa23[] stack;
    int size;
    int top;

    public StackTugasMahasiswa23(int size) {
        this.size = size;
        stack = new Mahasiswa23[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa23 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack Penuh! Tidak bisa menambahkan tugas lagi");
        }
    }

    public Mahasiswa23 pop() {
        if (!isEmpty()) {
            Mahasiswa23 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai");
            return null;
        }
    }

    public Mahasiswa23 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        // for (int i = 0; i <= top; i++) {
        for (int i = top; i >= 0; i--) { // berikut adalah perbaikan agar sesuai dengan perilaku lifo stack
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    // Modifikasi pertanyaan 4 Percobaan 1
    public Mahasiswa23 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    // Modifikasi Pertanyaan 5 Percobaan 1
    public int countTugas() {
        return top + 1;
    }
     public String konversiDesimalKeBiner(int nilai) {
        StackKonversi23 stackKonversi = new StackKonversi23();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stackKonversi.push(sisa);
            nilai = nilai / 2;
        }
        String biner = "";
        while (!stackKonversi.isEmpty()) {
            biner += stackKonversi.pop();
        }
        return biner;
    }
}