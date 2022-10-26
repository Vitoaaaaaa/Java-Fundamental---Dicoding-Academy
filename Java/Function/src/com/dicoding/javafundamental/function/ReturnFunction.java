package com.dicoding.javafundamental.function;

public class ReturnFunction {
    public static void main(String[] args) {

        Integer p = 7;
        Integer l = 8;
        Integer result =  cetakHasil(p,l);
        System.out.print("Hasil Dari Luas Segitiga Adalah: "+result);
    }

    public static Integer cetakHasil(Integer panjang, Integer lebar){
       Integer luas = panjang*lebar;
       return luas;
    }

}

