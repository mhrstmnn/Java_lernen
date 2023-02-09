package Beispiele.Kapitel_2;

import java.util.Arrays;

public class VariablesAndDataTypes {
    public static void main(String[] args) {
        // primitive Datentypen
        int age = 30;
        double height = 1.75;
        char gender = 'm';

        // Referenzdatentypen
        String name = "John Doe";
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Name: " + name);
        System.out.println("Alter: " + age);
        System.out.println("Größe: " + height);
        System.out.println("Geschlecht: " + gender);
        System.out.println("Zahlen: " + Arrays.toString(numbers));
    }
}
