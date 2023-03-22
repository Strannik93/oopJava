package org.example.hw.seminar5.service;

import org.example.hw.seminar5.model.Product;

import java.util.List;

public interface VendingMachine {
    List<Product> getProduct(String name);

}
