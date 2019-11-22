package com.example.myapplication.object;

public class Truyen {

    private  String tentruyen, tenchap, linkanh;
    public Truyen(){


    }
    public Truyen(String tentruyen, String tenchap, String linkanh) {
        this.tentruyen = tentruyen;
        this.tenchap = tenchap;
        this.linkanh = linkanh;
    }

    public String getTentruyen() {
        return tentruyen;
    }

    public void setTentruyen(String tentruyen) {
        this.tentruyen = tentruyen;
    }

    public String getTenchap() {
        return tenchap;
    }

    public void setTenchap(String tenchap) {
        this.tenchap = tenchap;
    }

    public String getLinkanh() {
        return linkanh;
    }

    public void setLinkanh(String linkanh) {
        this.linkanh = linkanh;
    }
}
