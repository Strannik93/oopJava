package org.example.hw.seminar5.model;

import java.util.Scanner;

public abstract class Product {
    protected String name;
    protected int price;
    protected int volume;



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("name:%s/price:%d/volume:%d",
                this.name, this.price, this.volume, this.getClass().getSimpleName());
    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
    public static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.next();
            if (isNumber(s)) return Integer.parseInt(s);
            else System.out.println("Это не число");
        }
    }

    abstract Product createProduct();
}
