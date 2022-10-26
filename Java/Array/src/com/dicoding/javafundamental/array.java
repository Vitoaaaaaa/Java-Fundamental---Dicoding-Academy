package com.dicoding.javafundamental;

import java.io.InputStreamReader;

public class array {
    public static void main(String[] args) {
        System.out.println("PENGGUNAAN ARRAY 1");
        int []arrInt={1,2,3,4,5,6};
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);
        System.out.println();

        System.out.println("PENGGUNAAN ARRAY 2");
        int [] arrInte= new int[6];
        arrInte[0]=1;
        arrInte[1]=2;
        arrInte[2]=3;
        arrInte[3]=4;
        arrInte[4]=5;
        arrInte[5]=6;
        System.out.println(arrInte[0]);
        System.out.println(arrInte[1]);
        System.out.println(arrInte[2]);
        System.out.println(arrInte[3]);
        System.out.println(arrInte[4]);
        System.out.println(arrInte[5]);
        System.out.println();

        System.out.println("PENGGUNAAN ARRAY 3");
        Integer [] array = new Integer[100];

        for (Integer i=0; i<array.length; i++){

            array[i] = i+1;
            System.out.println(array[i]);
        }


    }
}
