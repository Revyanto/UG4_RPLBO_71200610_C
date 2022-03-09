package com.ug5a.soal1;

public class TransPay {
    private String nama;
    private long saldo;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public void topUp (long money){
    if (money > 0)
    {this.saldo = this.saldo + money;
    System.out.println("Top up sebesar Rp " + money + " berhasil");}
    else {System.out.println("Nominal Anda tidak valid! Nominal harus lebih dari 0");}
    }

    public void bayar (int jumlah, Keyboard k){
    if(jumlah > 0)
        {if (saldo >= jumlah * k.getHarga())
        {saldo = this.saldo - (jumlah*k.getHarga());
            System.out.println("Pembayaran sukses! Silahkan mengambil " + k.getMerkModel() + " di counter");}
        else {System.out.println("Pembayaran gagal! saldo Anda kurang, silahkan melakukan top up!");}
        }
    else {System.out.println("Input jumlah tidak valid!");}
    }

}
