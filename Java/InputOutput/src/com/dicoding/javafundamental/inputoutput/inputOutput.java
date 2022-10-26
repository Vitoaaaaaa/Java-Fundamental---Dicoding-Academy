package com.dicoding.javafundamental.inputoutput;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM INPUT OUTPUT");
        System.out.println("===Program Penjumlahan Sangat Sederhana===");
        System.out.println("Masukkan Angka Pertama: ");
        int a = scanner.nextInt();
        System.out.println("Masukkan Angka Kedua: ");
        int b = scanner.nextInt();
        int result = a+b;
        System.out.println("Hasil dari penjumlahan: "+result);

    }
}
