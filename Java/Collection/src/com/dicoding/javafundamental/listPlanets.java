package com.dicoding.javafundamental;

import java.util.ArrayList;
import java.util.List;

public class listPlanets {
    public static void main(String[] args) {
        // deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";
        //heroes[2] = "zeus"; // error ArrayIndexOutOfBoundsException karena ukuran Array tetap

        //Menggunakan Array List
        List<String>planets = new ArrayList<>();
        planets.add("Mercury"); //Method add() untuk menambahkan objek ke dalam list
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars"); //Objek Lainnya masih bisa ditambahkan ke dalam LIST

        System.out.println("LIST PLANET AWAL: ");
        for (int i=0; i<planets.size(); i++){ //Method size untuk menambahkan ukuran ke dalam LIST
            System.out.println("\t Index- "+ i +" = "+planets.get(i)); //Method Get untuk memasukkan method list ke dalam I
        }

        planets.remove("Venus"); //Method remove untuk mengeluarkan objek dari list

        System.out.println("\nLIST PLANET AKHIR: ");
            for (int i=0; i< planets.size(); i++){
                System.out.println("\t Index- "+ i +" = "+planets.get(i));
            }

    }
}
