public class MahasiswaDemo23 {
    public static void main(String[] args) {
        
        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();
        
        Mahasiswa23 m1 = new Mahasiswa23("123", "Rafi", "2A", 3.2);
        Mahasiswa23 m2 = new Mahasiswa23("124", "Ayu", "2A", 3.5);
        Mahasiswa23 m3 = new Mahasiswa23("125", "Rofi", "2A", 3.1);
        Mahasiswa23 m4 = new Mahasiswa23("126", "Mavelynn", "2A", 3.9);
        Mahasiswa23 m5 = new Mahasiswa23("127", "Dola", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC) menggunakan BUBBLE SORT: ");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();
        
        System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        list.insertionSort();
        list.tampil();
    }
}