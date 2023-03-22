package org.example.hw.seminar5.model;

import java.util.Scanner;

public class HotDrink extends Product{

    private int temperature;
    public HotDrink(String name, int price, int volume, int temperature) {
        super.name = name;
        super.price = price;
        super.volume = volume;
        this.temperature = temperature;
    }

    public HotDrink() { }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public Product createProduct() {
        System.out.println("Ввод по очереди названия, цены, объема и температуры");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int price = enterNumber();
        int volume = enterNumber();
        int temperature = enterNumber();
        return new HotDrink(name, price, volume, temperature);
    }

    @Override
    public String toString() {
        return String.format("HotDrink//%s/temperature:%d",super.toString(), this.temperature);
    }
}
