package org.example.hw.seminar4;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineVersatile <T extends Product> implements VendingMachine{
    List <Product> products = new ArrayList<>();

    void add(T product) {
        this.products.add(product);
    }

    void remove(String productName, int productVolume) {
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i).getName().equals(productName)
                && this.products.get(i).getVolume() == productVolume)
                    this.products.remove(i);
        }
    }

    @Override
    public List<String> getProduct(String name) {
        List<String> rezult = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) rezult.add(products.get(i).toString());
        }
        if (rezult.size() == 0) rezult.add("Результатов нет");
        return rezult;
    }
}
