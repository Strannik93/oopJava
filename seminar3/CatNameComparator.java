package org.example.hw.seminar3;

import java.util.Comparator;

public class CatNameComparator implements Comparator <Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.compareTo(o2);
    }
}
