package org.example.hw.seminar1;

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
        return String.format("name: %s price: %d volume: %d",
                this.name, this.price, this.volume, this.getClass().getSimpleName());
    }
}
