package com.ug4.soal1;

public class Driver {
    private  String name;
    private int age;
    private String gender;

    public Driver (String supir,String jnsklm,int usia){
        name = supir;
        age = usia;
        gender = jnsklm;
    }
    String getName(){
        return name;
    }
    public void setName(String nama){
        name=nama;
    }
    int getAge(){
        return age;
    }
    public void setAge(int usia){
        age=usia;
    }
    String getGender(){
        return gender;
    }
    public void setGender(String jenisKelamin){
        gender = jenisKelamin;
    }
}
