package de.hrstmnn.Beispiele.Kapitel_5.Beispiel_3;

public class InterfacesExample {
    public static void main(String[] args) {
        Shape shape = new Shape("rot", 5);
        shape.draw();
        shape.scale(2);
        shape.draw();

        Circle circle = new Circle("blau", 3);
        circle.draw();
        circle.scale(0.5);
        circle.draw();
    }
}
