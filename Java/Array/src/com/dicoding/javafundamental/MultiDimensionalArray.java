package com.dicoding.javafundamental;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        char[][]arrChar = new char[3][]; // 0.0,0.1,0.2 && 1.0,1.1,1.2 && 2.0,2.1,2.2
        arrChar[0]=new char[2];
        arrChar[1]=new char[3];
        arrChar[2]=new char[4];

        //Dimensi 1 yang indeksnya 0 memiliki panjang elemen 3
        arrChar[0][0]='A';
        arrChar[0][1]='B';
        arrChar[0][3]='C';

        //Dimensi 1 yang indeksnya 1 memiliki panjang elemen 3
        arrChar[1][0]='D';
        arrChar[1][1]='E';
        arrChar[1][2]='F';

        //Dimensi 1 yang indeksnya 2 memiliki panjang elemen 4
        arrChar[2][0]='G';
        arrChar[2][1]='H';
        arrChar[2][2]='I';
        arrChar[2][3]='J';

        // Tampilkan semua data dari dimensi 1 yang memiliki indeks 0
        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 0 : " + arrChar[0][0]);
        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 1 : " + arrChar[0][1]);

        // Tampilkan semua data dari dimensi 1 yang memiliki indeks 1
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 0 : " + arrChar[1][0]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 1 : " + arrChar[1][1]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 2 : " + arrChar[1][2]);

        //Tampilkan semua data dari dimensi 1 yang memiliki indeks 2
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 2 : " + arrChar[2][0]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 2 : " + arrChar[2][1]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 2 : " + arrChar[2][2]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 2 : " + arrChar[2][3]);


    }
}
