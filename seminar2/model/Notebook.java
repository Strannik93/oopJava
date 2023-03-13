package org.example.hw.seminar2.model;

public abstract class Notebook {
    protected String name;
    protected Integer ram;
    protected Integer hardDriveSize;
    protected Integer price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHardDriveSize() {
        return hardDriveSize;
    }

    public void setHardDriveSize(Integer hardDriveSize) {
        this.hardDriveSize = hardDriveSize;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", hardDriveSize=" + hardDriveSize +
                ", price=" + price +
                '}';
    }

    public static String fieldReturn(String num) {
        if (num.equals("0")) return "name";
        if (num.equals("1")) return "ram";
        if (num.equals("2")) return "hardDriveSize";
        if (num.equals("3")) return "price";
        else return "-1";
    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
}
