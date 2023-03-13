package org.example.hw.seminar2.model;

import java.util.List;
import java.util.Map;

public interface NewFilter {
    static Map<String,String> createFilter() {
        return null;
    }

    default boolean checkMatch(Notebook current, Map<String, String> filter) {
        return true;
    }

    static void printList(List<Notebook> nList, Map<String,String> filter) { }
}
