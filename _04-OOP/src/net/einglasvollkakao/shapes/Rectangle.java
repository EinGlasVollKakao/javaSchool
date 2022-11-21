package net.einglasvollkakao.shapes;

public class Rectangle extends BaseShape {

    private double lenght;
    private double width;
    public Rectangle(String name, double length, double width) {
        super(name);
        this.lenght = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return lenght * width;
    }
}
