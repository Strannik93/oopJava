package org.example.hw.seminar6;

public class SingletonMount {
    private static SingletonMount INSTANCE;
    private int height;
    private int length;
    private String terrainType;
    private SingletonMount() {
    }
    public static SingletonMount getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonMount();
        }
        return INSTANCE;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    @Override
    public String toString() {
        return "SingletonMount{" +
                "height=" + height +
                ", length=" + length +
                ", terrainType='" + terrainType + '\'' +
                '}';
    }
}
