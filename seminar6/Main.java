package org.example.hw.seminar6;

public class Main {
    public static void main(String[] args) {
        System.out.println(SingletonMount.getINSTANCE());
        SingletonMount.getINSTANCE().setHeight(10);
        System.out.println(SingletonMount.getINSTANCE());
        SingletonMount.getINSTANCE().setLength(7);
        System.out.println(SingletonMount.getINSTANCE());
        SingletonMount.getINSTANCE().setTerrainType("Iron");
        System.out.println(SingletonMount.getINSTANCE());
    }
}
