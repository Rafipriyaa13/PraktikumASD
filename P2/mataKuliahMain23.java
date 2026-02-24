package P2;

public class mataKuliahMain23 {
    public static void main(String[] args) {

        mataKuliah23 mk1 = new mataKuliah23();
        mk1.kodeMK = "INF101";
        mk1.nama = "Dasar Pemrograman";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        System.out.println("===== Informasi MK1 =====");
        mk1.tampilInformasi();
        System.out.println("\n-- Ubah SKS --");
        mk1.ubahSKS(4);
        System.out.println("\n-- Tambah Jam --");
        mk1.tambahJam(2);
        System.out.println("\n-- Kurangi Jam (berhasil) --");
        mk1.kurangiJam(3);
        System.out.println("\n-- Kurangi Jam (gagal) --");
        mk1.kurangiJam(20);
        System.out.println("\n-- Informasi MK1 Setelah Perubahan --");
        mk1.tampilInformasi();

        mataKuliah23 mk2 = new mataKuliah23("INF202", "Struktur Data", 3, 4);
        System.out.println("\n===== Informasi MK2 =====");
        mk2.tampilInformasi();
        System.out.println("\n-- Ubah SKS --");
        mk2.ubahSKS(2);
        System.out.println("\n-- Tambah Jam --");
        mk2.tambahJam(4);
        System.out.println("\n-- Kurangi Jam (berhasil) --");
        mk2.kurangiJam(2);
        System.out.println("\n-- Informasi MK2 Setelah Perubahan --");
        mk2.tampilInformasi();
    }
}