package com.dicoding.javafundamental.operator;

public class OperatorUnary {
    public static void main(String[] args) {
        System.out.println("Operator Unary Plus");
        int nilaiAwal = 5;
        int hasil = nilaiAwal;
        System.out.println("Hasil +5: "+hasil);
        System.out.println();

        System.out.println("Operator Unary Minus");
        int nilaiAwal2 = 5;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("Hasil -5: "+nilaiAwal2);
        System.out.println();

        System.out.println("Operator Penigkatan Nilai awal sebesar 1 point");
        int nilaiAwal3=5;
        nilaiAwal3++;
        System.out.println("Hasil 5++: "+nilaiAwal3);
        System.out.println();

        System.out.println("Operator Penurunan Nilai awal sebesar 1 point");
        int nilaiAwal4=5;
        System.out.println("Hasil 5--:"+nilaiAwal4);
        System.out.println();

        System.out.println("Operator Komplemen Logika");
        boolean sukses = false;//nilai sukse adalah false
        System.out.println("Hasil !false: "+ !sukses);
        System.out.println();
    }
}
