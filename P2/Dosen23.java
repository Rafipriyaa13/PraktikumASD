package P2;

public class Dosen23 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen23() {

    }
    public Dosen23(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen         : "+idDosen);
        System.out.println("Nama             : "+nama);
        System.out.println("Status Aktif     : "+(statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung  : "+tahunBergabung);
        System.out.println("Bidang Keahlian  : "+bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        if (statusAktif) {
            System.out.println(nama+" sekarang berstatus: Aktif");
        } else {
            System.out.println(nama+" sekarang berstatus: Tidak Aktif");
        }
    }

    int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        System.out.println("Masa kerja "+ nama +": "+ masaKerja +" tahun");
        return masaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian berhasil diubah menjadi: "+ bidangKeahlian);
    }
}