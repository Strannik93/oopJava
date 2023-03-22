package org.example.hw.seminar5.view;

import org.example.hw.seminar5.model.Product;
import org.example.hw.seminar5.service.ProductsService;
import org.example.hw.seminar5.service.WorkFileService;

import java.util.List;
import java.util.Scanner;

public class ProductsView {
    ProductsService vmv = new ProductsService();
    public void menu() {
        boolean check = true;
        while (check) {
            Scanner scan = new Scanner(System.in);
            System.out.println("1-2: Загрузить-сохранить список\n3-4: Добавить-удалить продукт");
            System.out.println("5: Показать список\n0: Выход");
            String request = scan.next();
            switch (request) {
                case "1":
                    vmv.products = WorkFileService.fileUpload();
                    break;
                case "2":
                    WorkFileService.fileSave(vmv.products);
                    break;
                case "3":
                    vmv.add(vmv.productTypeSelect());
                    break;
                case "4":
                    vmv.remove();
                    break;
                case "5":
                    System.out.println("Введите для всего списка 1, для поиска по названию - любой текст кроме 1");
                    String sFull = scan.next();
                    List<Product> result;
                    if (sFull.equals("1")) {
                        result = vmv.products;
                        if (result.size() == 0) System.out.println("Список пуст");
                    } else {
                        System.out.println("Введите часть искомого названия продукта");
                        String searchName = scan.next();
                        result = vmv.getProduct(searchName);
                    }
                    for (int j = 0; j < result.size(); j++) {
                        System.out.println(result.get(j));
                    }
                    break;
                case "0":
                    check = false;
                    break;
            }
        }
    }
}
