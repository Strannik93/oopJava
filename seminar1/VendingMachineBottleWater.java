package org.example.hw.seminar1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottleWater extends VendingMachine{
    List <BottleOfWater> bottle = new ArrayList<>();
    void initProduct(List<BottleOfWater> bottle) {
        this.bottle = bottle;
    }

    @Override
    String getProduct(String name) {
        for (int i = 0; i < bottle.size(); i++) {
            if (bottle.get(i).getName().equals(name)) return bottle.get(i).getName();
        }
        return "Не найден";
    }
}
