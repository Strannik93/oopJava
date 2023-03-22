package org.example.hw.seminar5.service;

import org.example.hw.seminar5.model.BottleOfWater;
import org.example.hw.seminar5.model.Chips;
import org.example.hw.seminar5.model.HotDrink;
import org.example.hw.seminar5.model.Product;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkFileService {
    public static List <Product> fileUpload() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла (clear - чистый лист)");
        String s = scanner.next();
        List<Product> products = new ArrayList<>();
        if (s.equals("clear")) return products;
        try (FileReader fileReader = new FileReader(s)) {
            Scanner scanRead = new Scanner(fileReader);
            int i = 1;
            while (scanRead.hasNextLine()) {
                String current = scanRead.nextLine();
                String[] currMassif = current.split("//");
                String currType = currMassif[0];
                List<Object> currArr = new ArrayList<>();
                currMassif = currMassif[1].split("/");
                for (int j = 0; j < currMassif.length; j++) {
                    if (Product.isNumber(currMassif[j].split(":")[1]))
                        currArr.add(Integer.parseInt(currMassif[j].split(":")[1]));
                    else currArr.add(currMassif[j].split(":")[1]);
                }
                if (currType.equals("Chips"))
                    products.add(new Chips((String) currArr.get(0), (int) currArr.get(1), (int) currArr.get(2), (String) currArr.get(3)));
                else if (currType.equals("HotDrink"))
                    products.add(new HotDrink((String) currArr.get(0), (int) currArr.get(1), (int) currArr.get(2), (int) currArr.get(3)));
                else if (currType.equals("BottleOfWater"))
                    products.add(new BottleOfWater((String) currArr.get(0), (int) currArr.get(1), (int) currArr.get(2)));
                i++;
            }
            fileReader.close();
            return products;
        } catch (Exception e) {
        System.out.println("error opening the file");
        }
        return products;
    }

    public static void fileSave(List<Product> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла");
        String s = scanner.next();
        try(FileWriter fileWriter = new FileWriter(s)) {
            for (int i = 0; i < products.size(); i++) {
                if (i == products.size()-1) fileWriter.write(products.get(i).toString());
                else fileWriter.write(products.get(i).toString() + "\n");
            }
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("error saving the file");
        }
    }
}
