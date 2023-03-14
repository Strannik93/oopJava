package org.example.hw.seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListOfCatIterator implements Iterator <Cat> {
    private List<Cat> catListIteartor = new ArrayList<>();
    private int counter = 0;
    public ListOfCatIterator(List<Cat> catList){
        catListIteartor = catList;
        counter = -1;

    }
    @Override
    public boolean hasNext() {
        this.counter++;
        return counter < catListIteartor.size();
    }

    @Override
    public Cat next() {
        return catListIteartor.get(counter);
    }
}
