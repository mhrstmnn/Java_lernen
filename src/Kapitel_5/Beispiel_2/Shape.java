package Kapitel_5.Beispiel_2;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0.0;
    }

    public String toString() {
        return "Farbe: " + color;
    }
}
