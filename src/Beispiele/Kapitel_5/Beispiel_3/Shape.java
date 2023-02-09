package Beispiele.Kapitel_5.Beispiel_3;

public class Shape implements Drawable, Scalable {
    protected String color;
    protected double size;

    public Shape(String color, double size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("Zeichne Form in Farbe " + color + " und Größe " + size);
    }

    @Override
    public void scale(double factor) {
        size *= factor;
    }
}
