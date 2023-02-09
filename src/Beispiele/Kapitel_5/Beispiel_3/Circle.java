package Beispiele.Kapitel_5.Beispiel_3;

public class Circle extends Shape {
    public Circle(String color, double size) {
        super(color, size);
    }

    @Override
    public void draw() {
        System.out.println("Zeichne Kreis in Farbe " + color + " und Größe " + size);
    }
}