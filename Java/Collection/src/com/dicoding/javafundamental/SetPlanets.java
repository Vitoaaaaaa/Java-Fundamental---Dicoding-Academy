package com.dicoding.javafundamental;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanets {
    public static void main(String[] args) {
        //Menggunakan HashSet
        Set<String> planets = new HashSet<>(); // method add() untuk menambahkan objek ke Set
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Earth"); //menambahkan objek "earth" beberapa kali
        planets.add("Earth");
        planets.add("Mars"); //objek bisa terus ditambahkan ke Set

        //method size()untuk mendapatkan ukuran Set
        System.out.println("Set planet Awal: (size = "+planets.size()+")");
        for (String planet: planets){
            System.out.println("\t "+planet);
        }
        //method remove() untuk mengeluarkan objek dari set
        planets.remove("Venus");

        System.out.println("Set Planet Akhir: (size = "+planets.size()+")");
        for (Iterator iterator= planets.iterator();iterator.hasNext();){
            // looping menggunakan iterator
            System.out.println("\t " +iterator.next());
        }
    }
}
