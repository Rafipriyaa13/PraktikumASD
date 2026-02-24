package P2;

public class DosenMain23 {
    public static void main(String[] args) {

        Dosen23 dsn1 = new Dosen23();
        dsn1.idDosen = "DSN001";
        dsn1.nama = "Mamluatul Haniah";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2010;
        dsn1.bidangKeahlian = "Dasar Pemrograman";

        System.out.println("===== Informasi Dosen 1 =====");
        dsn1.tampilInformasi();
        System.out.println("\n-- Hitung Masa Kerja --");
        dsn1.hitungMasaKerja(2026);
        System.out.println("\n-- Ubah Status Aktif --");
        dsn1.setStatusAktif(false);
        System.out.println("\n-- Ubah Keahlian --");
        dsn1.ubahKeahlian("Machine Learning");
        System.out.println("\n-- Informasi Dosen 1 Setelah Perubahan --");
        dsn1.tampilInformasi();

        Dosen23 dsn2 = new Dosen23("DSN002", "Rafi Priya Nugraha", true, 2005, "Machine Learning");

        System.out.println("\n===== Informasi Dosen 2 =====");
        dsn2.tampilInformasi();
        System.out.println("\n-- Hitung Masa Kerja --");
        dsn2.hitungMasaKerja(2026);
        System.out.println("\n-- Ubah Status Aktif --");
        dsn2.setStatusAktif(false);
        System.out.println("\n-- Ubah Keahlian --");
        dsn2.ubahKeahlian("Cloud Computing");
        System.out.println("\n-- Informasi Dosen 2 Setelah Perubahan --");
        dsn2.tampilInformasi();
    }
}
