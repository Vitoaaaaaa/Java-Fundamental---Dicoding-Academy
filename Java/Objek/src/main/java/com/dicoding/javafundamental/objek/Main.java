package com.dicoding.javafundamental.objek;

import com.dicoding.javafundamental.objek.model.Hewan;

public class Main {
    public static void main(String[] args) {

       Hewan Elang = new Hewan("Burung Elang");
       Hewan Garuda = new Hewan("Burung Garuda");
       Hewan Rajawali = new Hewan("Burung Rajawali");

       Elang.beratHewan(5);
       Elang.jumlahKakiHewan(4);
       Elang.cetakHewan();

       Garuda.beratHewan(6);
       Garuda.jumlahKakiHewan(4);
       Garuda.cetakHewan();

       Rajawali.beratHewan(8);
       Rajawali.jumlahKakiHewan(2);
       Rajawali.cetakHewan();




        //Menciptakan Objek dengan nama'objekHewan'
       /* Hewan objekHewan = new Hewan();
        objekHewan.cetakName("Elang");
        objekHewan.cetakName("Garuda");*/
    }
}
