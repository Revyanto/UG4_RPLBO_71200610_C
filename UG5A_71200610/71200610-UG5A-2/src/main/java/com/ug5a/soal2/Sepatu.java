package com.ug5a.soal2;

public class Sepatu {
    private String kode;
    private String merkModel;
    private static int nextNum;
    private int ukuran;
    private long harga;
    private int stok;


    public Sepatu(String argMerkModel, int argUkuran, int argHarga, int argStok){
    this.merkModel = argMerkModel;
    this.ukuran = argUkuran;
    this.harga = argHarga;
    this.stok = argStok;
    }

    public String getKode() {
        this.nextNum = this.nextNum + 1;
        this.kode = "NK0024510"+nextNum;
        return kode;
    }

    public String getMerkModel() {
        return merkModel;
    }

    public int getUkuran() {
        return ukuran;
    }

    public long getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
}
