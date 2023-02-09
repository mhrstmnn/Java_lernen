package Beispiele.Kapitel_5.Beispiel_4;

import java.util.ArrayList;

public class GenericExample<T> {
    private final ArrayList<T> list;

    public GenericExample() {
        this.list = new ArrayList<T>();
    }

    public static void main(String[] args) {
        // Eine Instanz von GenericExample mit dem Typparameter Integer erzeugen
        GenericExample<Integer> example = new GenericExample<>();

        // Einige Elemente hinzufügen
        example.add(1);
        example.add(2);
        example.add(3);

        // Elemente ausgeben
        System.out.println(example.get(0));
        System.out.println(example.get(1));
        System.out.println(example.get(2));
    }

    public void add(T element) {
        this.list.add(element);
    }

    public T get(int index) {
        return this.list.get(index);
    }
}
