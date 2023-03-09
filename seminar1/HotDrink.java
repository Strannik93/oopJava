package org.example.hw.seminar1;

public class HotDrink extends Product{

    private int temperature;
    public HotDrink(String name, int price, int volume, int temperature) {
        super.name = name;
        super.price = price;
        super.volume = volume;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("%s  temperature: %d",super.toString(), this.temperature);
    }
}
