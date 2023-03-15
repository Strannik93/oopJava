package org.example.hw.seminar4;

public class Сhips extends Product{

    private String packingType;

    public String getPackingType() {
        return packingType;
    }

    public void setPackingType(String packingType) {
        this.packingType = packingType;
    }

    public Сhips(String name, int price, int volume, String packingType) {
        super.name = name;
        super.price = price;
        super.volume = volume;
        this.packingType = packingType;
    }

    @Override
    public String toString() {
            return String.format("%s  packingType: %s",super.toString(), this.packingType);
    }
}
