package org.example.hw.seminar2.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notebook1  extends Notebook implements NewFilter{
    private String os;
    private String color;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook1{" +
                "os='" + os + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", ram=" + ram +
                ", hardDriveSize=" + hardDriveSize +
                ", price=" + price +
                '}';
    }

    public Notebook1(String name, Integer ram, Integer hardDriveSize, String os, String color, Integer price) {
        super.name = name;
        super.ram = ram;
        super.hardDriveSize = hardDriveSize;
        this.os = os;
        this.color = color;
        super.price = price;
    }


    public static Map<String, String> createFilter() {
        Map<String, String> filter = new HashMap<>();
        filter.put("name", null);
        filter.put("ram", null);
        filter.put("hardDriveSize", null);
        filter.put("os", null);
        filter.put("color", null);
        filter.put("price", null);
        return filter;
    }

    private static boolean checkMatch(Notebook1 current, Map<String, String> filter) {
        if (filter.get("name") != null) if (!current.name.toLowerCase().contains(filter.get("name").toLowerCase())) return false;
        if (filter.get("ram") != null) if (current.ram != Integer.parseInt(filter.get("ram").trim())) return false;
        if (filter.get("hardDriveSize") != null) if (current.hardDriveSize != Integer.parseInt(filter.get("hardDriveSize").trim())) return false;
        if (filter.get("os") != null) if (!current.os.toLowerCase().contains(filter.get("os").toLowerCase())) return false;
        if (filter.get("color") != null) if (!current.color.toLowerCase().contains(filter.get("color").toLowerCase())) return false;
        if (filter.get("price") != null) return current.price <= Integer.parseInt(filter.get("price").trim());
        return true;
    }

    public static void printList(List<Notebook1> nList, Map<String, String> filter) {
        for (int i = 0; i < nList.size(); i++) {
            if (checkMatch(nList.get(i), filter)) System.out.println(nList.get(i));
            else {
                nList.remove(i);
                i -= 1;
            }
        }
        if (nList.size() == 0) System.out.println("Результатов не найдено\n");
        else System.out.println();
    }

    public static String fieldReturn(String num) {
        if (num.equals("0")) return "name";
        if (num.equals("1")) return "ram";
        if (num.equals("2")) return "hardDriveSize";
        if (num.equals("3")) return "os";
        if (num.equals("4")) return "color";
        if (num.equals("5")) return "price";
        else return "-1";
    }
}
