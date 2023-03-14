package org.example.hw.seminar3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Cat> cc = new CatNameComparator().thenComparing(new CatComparator());
        ListOfCats cats = new ListOfCats();
        cats.setCatList(List.of(
                new Cat("barsik", 5),
                new Cat("murzik", 3),
                new Cat("barsik", 2),
                new Cat("murzik", 1)));
        Iterator <Cat> ci = cats.iterator();
        while (ci.hasNext()) {
            System.out.println(ci.next());
        }
        System.out.println("----------------------");
        TreeSet<Cat> treeCat = new TreeSet<>(cc);
        treeCat.add(new Cat("barsik", 5));
        treeCat.add(new Cat("murzik", 3));
        treeCat.add(new Cat("barsik", 2));
        treeCat.add(new Cat("murzik", 1));
        System.out.println(treeCat);
    }
}
