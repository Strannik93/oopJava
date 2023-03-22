package org.example.hw.seminar5.model;

import java.util.Scanner;

public class Chips extends Product{

    private String packingType;

    public String getPackingType() {
        return packingType;
    }

    public void setPackingType(String packingType) {
        this.packingType = packingType;
    }

    public Chips(String name, int price, int volume, String packingType) {
        super.name = name;
        super.price = price;
        super.volume = volume;
        this.packingType = packingType;
    }

    public Chips() { }

    @Override
    public Product createProduct() {
        System.out.println("Ввод по очереди названия, цены, объема и типа упаковки");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int price = enterNumber();
        int volume = enterNumber();
        String packingType = scanner.next();
        return new Chips(name, price, volume, packingType);
    }

    @Override
    public String toString() {
            return String.format("Chips//%s/packingType:%s",super.toString(), this.packingType);
    }
}
