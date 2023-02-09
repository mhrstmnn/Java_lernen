package de.hrstmnn.Beispiele.Kapitel_5.Beispiel_2;

public class InheritanceAndPolymorphism {
    public static void main(String[] args) {
        Shape shape = new Shape("rot");
        System.out.println(shape);
        System.out.println("Fläche: " + shape.getArea());

        Circle circle = new Circle("blau", 5);
        System.out.println(circle);
        System.out.println("Fläche: " + circle.getArea());

        Rectangle rectangle = new Rectangle("grün", 4, 5);
        System.out.println(rectangle);
        System.out.println("Fläche: " + rectangle.getArea());

        Shape[] shapes = {shape, circle, rectangle};
        for (Shape s : shapes) {
            System.out.println(s);
            System.out.println("Fläche: " + s.getArea());
        }
    }
}

