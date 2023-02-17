package de.hrstmnn.Aufgaben.Loesung_1;

import java.util.Scanner;

public class Calculator {
    static double add(double zahl1, double zahl2) {
        return zahl1 + zahl2;
    }

    static double subtract(double zahl1, double zahl2) {
        return zahl1 - zahl2;
    }

    static double multiply(double zahl1, double zahl2) {
        return zahl1 * zahl2;
    }

    static double divide(double zahl1, double zahl2) {
        return zahl1 / zahl2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gib die erste Zahl ein: ");
        double zahl1 = input.nextDouble();

        System.out.print("Gib die zweite Zahl ein: ");
        double zahl2 = input.nextDouble();

        double summe = add(zahl1, zahl2);
        double differenz = subtract(zahl1, zahl2);
        double produkt = multiply(zahl1, zahl2);
        double quotient = divide(zahl1, zahl2);

        System.out.println("Summe: " + summe);
        System.out.println("Differenz: " + differenz);
        System.out.println("Produkt: " + produkt);
        System.out.println("Quotient: " + quotient);
    }
}
