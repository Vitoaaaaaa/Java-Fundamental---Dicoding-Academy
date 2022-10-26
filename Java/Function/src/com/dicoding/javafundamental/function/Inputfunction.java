package com.dicoding.javafundamental.function;

public class Inputfunction {
    public static void main(String[] args) {
        hitungLuas(7,8.5);
    }


    public static void hitungLuas(double panjang, double lebar) {
        double luas;
        luas = panjang*lebar;
        System.out.println("Luas Segitiga: "+luas);
    }
}