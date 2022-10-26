package com.dicoding.javafundamental.objek;

import com.dicoding.javafundamental.objek.model.Smartphone;

public class AnotherMain {
    public static void main(String[] args) {


        Smartphone Iphone = new Smartphone("Iphone");
        Smartphone Xiaomi = new Smartphone("Xiaomi");

        Iphone.setSeries("Iphone 14 pro");
        Iphone.setProcessor("BIONIC 11");
        Iphone.setStorage(128);
        Iphone.setRam(16);
        Iphone.printSmartphone();
        System.out.println();

        Xiaomi.setSeries("Xiaomi MI 10");
        Xiaomi.setProcessor("SNAPDRAGON 865+");
        Xiaomi.setStorage(128);
        Xiaomi.setRam(16);
        Xiaomi.printSmartphone();
        System.out.println();

    }
}
