package com.dicoding.javafundamental.operator;
//OPERATOR EQUALITY
public class OperatorEquality {
    public static void main(String[] args) {
        System.out.println("Operator unary Kesetaraan");
        int value=4;
        int anotherValue=5;
        boolean result;
        result = value==anotherValue;
        System.out.println("Hasil dari value==anotherValue: "+result);
        System.out.println();

        System.out.println("Operator Tidak Sama Dengan");
        result = value!=anotherValue;
        System.out.println("Hasil dari value!=anotherValue: "+result);
        System.out.println();

        System.out.println("Operator Unary Lebih Dari");
        result = value>anotherValue;
        boolean result1 = value<anotherValue;
        System.out.println("Hasil dari value>anotherValue: "+result);
        System.out.println("Hasil dari value<anotherValue: "+result1);
        System.out.println();

        System.out.println("Operator Unary Kurang Dari Sama Dengan: ");
        result = value>=anotherValue;
        boolean result2 = value<=anotherValue;
        System.out.println("Hasil dari value>=anotherValue: "+result);
        System.out.println("Hasil dari value<=anotherValue: "+result2);
        System.out.println();

    }
}
