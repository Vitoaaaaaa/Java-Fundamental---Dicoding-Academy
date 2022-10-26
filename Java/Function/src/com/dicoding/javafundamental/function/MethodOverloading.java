package com.dicoding.javafundamental.function;

public class MethodOverloading {
    public static void main(String[] args) {

        luasSegitiga(7,5);
        luasSegitiga(10,10);
    }


    public static void luasSegitiga(Double panjang, Double lebar){
        double result = panjang*lebar;
        System.out.print("Luas Segitiga: "+result);
    }

    public static void luasSegitiga(Integer panjang, Integer lebar){
        Integer result = panjang*lebar;
        System.out.print("\nLuas Segitiga: "+result);
    }

}