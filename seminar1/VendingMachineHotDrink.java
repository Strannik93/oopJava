package org.example.hw.seminar1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrink extends VendingMachine{
    List<HotDrink> hd = new ArrayList<>();
    void initProduct(List<HotDrink> hd) {
        this.hd = hd;
    }


    @Override
    String getProduct(String name) {
        for (int i = 0; i < hd.size(); i++) {
            if (hd.get(i).getName().equals(name)) return hd.get(i).getName();
        }
        return "Не найден";
    }

    String getProduct(String name, int volume, int temperature) {
        for (int i = 0; i < hd.size(); i++) {
            if (hd.get(i).getName().equals(name) && hd.get(i).getVolume() == volume
                && hd.get(i).getTemperature() == temperature) return hd.get(i).getName();
        }
        return "Не найден";
    }
}
