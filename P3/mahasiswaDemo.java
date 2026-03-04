package P3;

public class mahasiswaDemo {
    public static void main(String[] args) {
        mahasiswa23[] arrayOfMahasiswa23 = new mahasiswa23[3];
        arrayOfMahasiswa23[0] = new mahasiswa23();
        arrayOfMahasiswa23[0].nim = "254107020120";
        arrayOfMahasiswa23[0].nama = "Agnes Titania Kinanti";
        arrayOfMahasiswa23[0].kelas = "SIB-1E";
        arrayOfMahasiswa23[0].ipk = (float) 3.75;

        arrayOfMahasiswa23[1] = new mahasiswa23();
        arrayOfMahasiswa23[1].nim = "3224232424242";
        arrayOfMahasiswa23[1].nama = "Achmad Maulana Hamzah";
        arrayOfMahasiswa23[1].kelas = "TI-2A";
        arrayOfMahasiswa23[1].ipk = (float) 3.36;

        arrayOfMahasiswa23[2] = new mahasiswa23();
        arrayOfMahasiswa23[2].nim = "2541070287890";
        arrayOfMahasiswa23[2].nama = "Dirhamwan Putranto";
        arrayOfMahasiswa23[2].kelas = "TI-2E";
        arrayOfMahasiswa23[2].ipk = (float) 3.95;

        System.out.println("NIM         : "+arrayOfMahasiswa23[0].nim);
        System.out.println("NAMA        : "+arrayOfMahasiswa23[0].nama);
        System.out.println("KELAS       : "+arrayOfMahasiswa23[0].kelas);
        System.out.println("IPK         : "+arrayOfMahasiswa23[0].ipk);
        System.out.println("------------------------------------------------------------");

        System.out.println("NIM         : "+arrayOfMahasiswa23[1].nim);
        System.out.println("NAMA        : "+arrayOfMahasiswa23[1].nama);
        System.out.println("KELAS       : "+arrayOfMahasiswa23[1].kelas);
        System.out.println("IPK         : "+arrayOfMahasiswa23[1].ipk);
        System.out.println("------------------------------------------------------------");

        System.out.println("NIM         : "+arrayOfMahasiswa23[2].nim);
        System.out.println("NAMA        : "+arrayOfMahasiswa23[2].nama);
        System.out.println("KELAS       : "+arrayOfMahasiswa23[2].kelas);
        System.out.println("IPK         : "+arrayOfMahasiswa23[2].ipk);
        System.out.println("------------------------------------------------------------");
    }
}
