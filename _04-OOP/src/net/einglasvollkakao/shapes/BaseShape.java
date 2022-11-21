package net.einglasvollkakao.shapes;

public class BaseShape {
    private String name;

    public BaseShape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return 0;
    }
}
