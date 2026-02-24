package P2;

public class mahasiswamain23 {
    public static void main(String[] args) {
        mahasiswa23 mhs1 = new mahasiswa23();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "25410720120";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa23 mhs2 = new mahasiswa23("Anissa Nabila", "2541072120", 3.25, "TI-1E");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

    
    }
}
