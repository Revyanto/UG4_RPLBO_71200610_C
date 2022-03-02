package com.ug4.soal1;

public class Passenger {
    private String name;
    private double balance;
    private String email;
    private String destiny;

    public Passenger(String penumpang, String imel, double uang){
        name = penumpang;
        email = imel;
        balance = uang;
    }
    String getName(){
        return name;
    }
    public void setName(String nama){
        name=nama;
    }
    double getBalance(){
        return balance;
    }
    public void setBalance(double uang){
        balance = uang;
    }
    String getEmail(){
        return email;
    }
    public void setEmail(String imel){
        email = imel;
    }
    String getDestiny(){
        return destiny;
    }
    public void setDestiny(String tujuan){
        destiny=tujuan;
    }
}
