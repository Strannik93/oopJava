package org.example.hw.seminar4;

public class Main {
    public static void main(String[] args) {
        VendingMachineVersatile vmv = new VendingMachineVersatile();
        vmv.add(new BottleOfWater("pepsi", 42, 45));
        vmv.add(new HotDrink("latte", 42, 45, 70));
        vmv.add(new BottleOfWater("coca-cola", 67, 90));
        vmv.add(new HotDrink("espresso", 67, 64, 65));
        vmv.add(new BottleOfWater("coca-cola", 50, 70));
        vmv.add(new HotDrink("greenfield", 50, 70, 50));
        vmv.add(new Сhips("Lay's", 65, 40, "Пакет «флоу-пак»"));
        for (int i = 0; i < vmv.products.size(); i++) {
            System.out.println(vmv.products.get(i));
        }
        System.out.println(vmv.getProduct("coca-cola"));
    }
}
