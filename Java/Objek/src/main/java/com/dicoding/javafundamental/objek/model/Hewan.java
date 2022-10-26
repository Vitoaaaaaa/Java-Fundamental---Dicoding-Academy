package com.dicoding.javafundamental.objek.model;

public class Hewan {

    String nama;
        Integer berat;
        Integer jumlahKaki;

        //ini merupakan konstruktor dari kelas hewan.konstruktor adalah method yang pertama kali dijalankan ketika object di ciptakan
        public Hewan(String namaHewan){
            nama = namaHewan;
        }

        public void beratHewan(Integer beratHewan){
            berat = beratHewan;
        }

        public void jumlahKakiHewan(Integer jumlahKakiHewan){
            jumlahKaki = jumlahKakiHewan;
        }

        public void cetakHewan(){
            System.out.print("Nama Hewan: "+nama);
            System.out.print("\nBerat Hewan: "+berat);
            System.out.print("\nJumlah Kaki Hewan: "+jumlahKaki);
        }





    /*public void cetakName(String nama){
        System.out.println("Nama Hewan: "+nama);
    }*/
}

