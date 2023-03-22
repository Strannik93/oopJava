package org.example.hw.seminar5.service;

import org.example.hw.seminar5.model.BottleOfWater;
import org.example.hw.seminar5.model.Chips;
import org.example.hw.seminar5.model.HotDrink;
import org.example.hw.seminar5.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductsService<T extends Product> implements VendingMachine{
    public List <Product> products = new ArrayList<>();

    public void add(T product) {
        boolean checkAdd = true;
        int i = 0;
        while (checkAdd) {
            if (i < this.products.size()) {
                if (this.products.get(i).getName().equals(product.getName())
                        && this.products.get(i).getVolume() == product.getVolume()) checkAdd = false;
            } else break;
            i++;
        }
        if (checkAdd) this.products.add(product);
        else System.out.println("Товар уже есть в наличии");
    }

    public void remove() {
        Scanner scanRemove = new Scanner(System.in);
        System.out.println("Введите по очереди название и объем удаляемого продукта");
        String productName = scanRemove.next();
        int productVolume = Product.enterNumber();
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i).getName().equals(productName)
                && this.products.get(i).getVolume() == productVolume)
                    this.products.remove(i);
        }
    }

    @Override
    public List<Product> getProduct(String name) {
        List<Product> result = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().contains(name)) result.add(products.get(i));
        }
        if (result.size() == 0) System.out.println("Результатов нет");
        return result;
    }

    public Product productTypeSelect() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Типы продукта: 1 - Chips, 2 - HotDrink, 3 - BottleOfWater");
            String typeProduct = scanner.next();
            if (typeProduct.equals("1")) return new Chips().createProduct();
            else if (typeProduct.equals("2")) return new HotDrink().createProduct();
            else if (typeProduct.equals("3")) return new BottleOfWater().createProduct();
        }
    }
}
