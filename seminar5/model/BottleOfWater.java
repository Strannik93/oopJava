package org.example.hw.seminar5.model;

import java.util.Scanner;

public class BottleOfWater extends Product{
    public BottleOfWater(String name, int price, int volume) {
        super.name = name;
        super.price = price;
        super.volume = volume;
    }

    public BottleOfWater() { }

    @Override
    public Product createProduct() {
        System.out.println("Ввод по очереди названия, цены и объема");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int price = enterNumber();
        int volume = enterNumber();
        return new BottleOfWater(name, price, volume);
    }

    @Override
    public String toString() {
        return String.format("BottleOfWater//%s",super.toString());
    }
}
