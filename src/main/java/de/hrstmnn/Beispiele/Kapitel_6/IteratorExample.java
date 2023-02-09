package de.hrstmnn.Beispiele.Kapitel_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Max");
        names.add("Moritz");
        names.add("Monika");

        // Verwendung eines for-each-Loops
        for (String name : names) {
            System.out.println(name);
        }

        // Verwendung eines Iterators
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
