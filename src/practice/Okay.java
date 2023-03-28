package practice;

abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Okay {
    public static void main(String[] args) {
        Shape s = new Rectangle("red", 5, 10);
        Shape c = new Circle("blue", 7);

        System.out.println("Rectangle color: " + s.getColor());
        System.out.println("Rectangle area: " + s.getArea());

        System.out.println("Circle color: " + c.getColor());
        System.out.println("Circle area: " + c.getArea());
    }
}

