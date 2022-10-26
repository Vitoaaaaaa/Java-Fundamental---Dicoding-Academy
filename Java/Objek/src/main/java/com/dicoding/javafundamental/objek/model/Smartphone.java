package com.dicoding.javafundamental.objek.model;

public class Smartphone {

    String name;
        String series;
        String processor;
        Integer storage;
        Integer ram;

    public Smartphone(String phoneName){

        name = phoneName;
    }

    public void setSeries (String setSeries){

        series = setSeries;
    }

    public void setProcessor (String setProcessor)
    {
        processor = setProcessor;
    }

    public void setStorage(Integer setStorage){
        storage = setStorage;
    }

    public void setRam (Integer setRam){
        ram = setRam;
    }

    public void printSmartphone(){
        System.out.print("\nSmartphone: "+name);
        System.out.print("\nSeries: "+series);
        System.out.print("\nProcessor: "+processor);
        System.out.print("\nStorage: "+storage);
        System.out.print("\nRAM: "+ram);
    }
}
