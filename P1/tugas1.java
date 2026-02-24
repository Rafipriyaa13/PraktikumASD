import java.util.Scanner;
public class tugas1 {

    static char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
    static char[][] kota = {
        {'B','A','N','T','E','N'},
        {'J','A','K','A','R','T','A'},
        {'B','A','N','D','U','N','G'},
        {'C','I','R','E','B','O','N'},
        {'B','O','G','O','R'},
        {'P','E','K','A','L','O','N','G','A','N'},
        {'S','E','M','A','R','A','N','G'},
        {'S','U','R','A','B','A','Y','A'},
        {'M','A','L','A','N','G'},
        {'T','E','G','A','L'}
    };
    
    static int cariKode(char input) {
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == input) {
                return i; 
            }
        }
        return -1; 
    }
    static void tampilKota(int index) {
        System.out.print("Nama kota: ");
        for (int j = 0; j < kota[index].length; j++) {
            System.out.print(kota[index][j]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char input = scanner.next().toUpperCase().charAt(0);
        int index = cariKode(input);

        if (index != -1) {
            tampilKota(index);
        } else {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }

        scanner.close();
    }
}

