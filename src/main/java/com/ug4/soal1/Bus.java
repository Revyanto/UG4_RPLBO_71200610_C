package com.ug4.soal1;

import java.util.ArrayList;

public class Bus {
    private String name;
    private Driver driver;
    private int CAPACITY =25;
    private final ArrayList<Passenger> passenger = new ArrayList<>();
    private int usedCapacity;
    private final double fares=20000;
    private double profit;
    private String ROUTE="Kampus UKDW, Asrama Omah Babadan, Asrama Teologi.";

    public Bus(String namaBus,Driver supir){
        name = namaBus;
        driver = supir;
    }
    String getName(){
        return name;
    }
    public void setName(String nama){
        name=nama;
    }
    Driver getDriver(){
        return driver;
    }
    public void setDriver(Driver supir) {
        driver = supir;
    }
    int getCapacity(){
      return CAPACITY;
    }
    final Arraylist<Passenger> getPassenger(){
      return passenger;
    }

    int getUsedCapacity(){
        return usedCapacity;
    }
    private void setUsedCapacity(int isi){
        usedCapacity = isi;
    }
    double getFares(){
      return fares;
    }

    double getProfit(){
        return profit;
    }
    private void setProfit(double untung){
        profit=untung;
    }
    //boolean checkPassengerBalance(Passenger){
    //    return ;}

    public void topUpBalance(double uang,Passenger passenger){
        passenger.setBalance(uang);
      }

    private void takePassenger(Passenger pick){

    }
    public void dropPassenger(Passenger kick){

    }
    public void proceedOrder(String order, Passenger penumpang){

    }
    private String cancelOrder(Passenger penumpang){
        return "cancel";
    }
}
