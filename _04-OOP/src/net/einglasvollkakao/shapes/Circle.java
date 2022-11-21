package net.einglasvollkakao.shapes;

public class Circle extends BaseShape{

    private double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
