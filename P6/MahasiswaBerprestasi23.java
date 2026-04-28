package P6;

public class MahasiswaBerprestasi23 {
    Mahasiswa23 listMhs[] = new Mahasiswa23[5];
    int idx;
    int SequentialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk==cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }
    int findBinarySearch(double cari,int left, int right){
        int mid;
        if (right>=left) {
            mid = (right+left)/2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            }else if(listMhs[mid].ipk>cari){
                return findBinarySearch(cari, left, mid-1);
            }else{
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    void tampilPosisi(double x,int pos){
        if (pos!=-1){
            System.out.println("data mahasiswa dengan IPK :" +x+" ditemukan pada indeks "+pos);
        }else{
            System.out.println("Data " +x+ " Tidak Ditemukan ");
        }
    }
    void tampilDataSearch(double x,int pos){
        if (pos !=-1) {
            System.out.println("Nim\t :"+listMhs[pos].nim);
            System.out.println("Nama\t :"+listMhs[pos].nama);
            System.out.println("Kelas\t :"+listMhs[pos].kelas);
            System.out.println("Ipk\t "+listMhs[pos].ipk);
        }else{
            System.out.println("Data mahasiswa dengan IPK "+x+" tidak ditemukan");
        }
    }
    void tambah(Mahasiswa23 mhs){
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh!");
        }
    }
    void tampil() {
    for (Mahasiswa23 mhs : listMhs) {
        if (mhs != null) { 
            mhs.tampilInformasi();
            System.out.println("------------------------------------");
        }
    }
}
}
