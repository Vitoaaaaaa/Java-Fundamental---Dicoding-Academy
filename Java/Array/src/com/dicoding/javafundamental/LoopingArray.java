package com.dicoding.javafundamental;

public class LoopingArray {
    public static void main(String[] args) {
        System.out.println("PENGGUNAAN ARRAY 3");
        Integer [] array = new Integer[100];

        for (Integer i=0; i<array.length; i++){

            array[i] = i+1;
            System.out.println(array[i]);
        }
    }
}
