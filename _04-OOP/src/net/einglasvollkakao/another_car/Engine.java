package net.einglasvollkakao.another_car;

public class Engine {
    public enum Type {DIESEL, GAS}
    private Type engineType;
    private double penguinPower;
    
    public Engine(Type engineType, double penguinPower) {
        this.engineType = engineType;
        this.penguinPower = penguinPower;
    }
}
