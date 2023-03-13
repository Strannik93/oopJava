package org.example.hw.seminar2;

import org.example.hw.seminar2.model.Notebook1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Notebook1> newList = new ArrayList<>();
        newList.add(new Notebook1("ASUS Vivobook Pro 16 OLED", 16, 1024, "Windows 10 Home", "black", 120000));
        newList.add(new Notebook1("Apple MacBook Air 13", 8, 256, "macOS", "white", 100000));
        newList.add(new Notebook1("Xiaomi RedmiBook 14 II", 16, 512, "Windows 10 Home", "white", 56000));
        newList.add(new Notebook1("HP Spectre X360", 16, 512, "Windows 10 Home", "black", 140000));
        newList.add(new Notebook1("Lenovo ThinkPad X1 Carbon Gen 9", 16, 512, "Windows 10 Pro", "black", 200000));
        newList.add(new Notebook1("Acer Aspire 3 A317-52-599Q", 8, 256, "Linux", "black", 75000));
        Map<String, String> filterMap = Notebook1.createFilter();
        Menu.mainMenu(newList, filterMap);
    }
}
