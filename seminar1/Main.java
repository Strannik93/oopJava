package org.example.hw.seminar1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
 * перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
 * соответствующий имени, объему и температуре
 */
public class Main {
    public static void main(String[] args) {
        VendingMachineBottleWater vm1 = new VendingMachineBottleWater();
        List<BottleOfWater> bw = new ArrayList<>(Arrays.asList(new BottleOfWater("pepsi", 42, 45),
                new BottleOfWater("coca-cola", 67, 90), new BottleOfWater("coca-cola", 50, 70)));
        vm1.initProduct(bw);
        System.out.println(bw);
        System.out.println(vm1.getProduct("pepsi"));
        System.out.println("--------------------");
        VendingMachineHotDrink vm2 = new VendingMachineHotDrink();
        List<HotDrink> hd = new ArrayList<>(Arrays.asList(new HotDrink("latte", 42, 45, 70),
                new HotDrink("espresso", 67, 64, 65), new HotDrink("greenfield", 50, 70, 50)));
        vm2.initProduct(hd);
        System.out.println(hd);
        System.out.println(vm2.getProduct("espresso", 64, 65));
    }
}
