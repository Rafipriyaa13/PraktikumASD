package P3;

import P2.mataKuliah23;

public class Matakuliah23 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
public Matakuliah23(){

}

public Matakuliah23(String kode,String nama, int sks,int jumlahJam){
    this.kode=kode;
    this.nama=nama;
    this.sks=sks;
    this.jumlahJam=jumlahJam;
}
public void tambahData(String kode,String nama, int sks,int jumlahJam){
    this.kode = kode;
    this.nama = nama;
    this.sks = sks;
    this.jumlahJam = jumlahJam;
}

}
