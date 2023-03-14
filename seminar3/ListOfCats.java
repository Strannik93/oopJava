package org.example.hw.seminar3;

import java.util.Iterator;
import java.util.List;
public class ListOfCats implements Iterable <Cat> {
    private List<Cat> catList;

    public List<Cat> getCatList() {
        return catList;
    }

    public void setCatList(List<Cat> catList) {
        this.catList = catList;
    }

    @Override
    public Iterator<Cat> iterator() {
        return new ListOfCatIterator(catList);
    }
}
