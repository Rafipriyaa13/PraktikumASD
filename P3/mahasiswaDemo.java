package P3;
import java.util.Scanner;
public class mahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mahasiswa23[] arrayOfMahasiswa23 = new mahasiswa23[3];
        String dummy;
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa23[i]=new mahasiswa23();
            System.out.println("Masukkan Data Mahasiswa Ke-"+(i+1));
            System.out.print("NIM   :");
            arrayOfMahasiswa23[i].nim=sc.nextLine();
            System.out.print("Nama  :");
            arrayOfMahasiswa23[i].nama = sc.nextLine();
            System.out.print("Kelas :");
            arrayOfMahasiswa23[i].kelas=sc.nextLine();
            System.out.print("IPK   :");
            dummy=sc.nextLine();
            arrayOfMahasiswa23[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------------------------------------");
        }
        for (int i = 0; i < arrayOfMahasiswa23.length; i++) {
        System.out.println("Data Mahasiswa ke-" + (i+1));
        System.out.println("NIM         : "+arrayOfMahasiswa23[i].nim);
        System.out.println("NAMA        : "+arrayOfMahasiswa23[i].nama);
        System.out.println("KELAS       : "+arrayOfMahasiswa23[i].kelas);
        System.out.println("IPK         : "+arrayOfMahasiswa23[i].ipk);
        System.out.println("------------------------------------------------------------");
        }
        
    }
}
