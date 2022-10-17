import java.util.ArrayList;
import java.util.List;

public class Car {
    
    private final String serialNumber;
    private final String brand;
    private final String color;
    
    private Engine engine;
    private List<Mirror> mirrors = new ArrayList<>();
    private final double tankVolume;
    private final double fuelConsumption;
    private double fuelAmount;
    
    public Car(Engine engine, String serialNumber, String color, String brand, double tankVolume, double fuelConsumption, double fuelAmount) {
        this.engine = engine;
        this.serialNumber = serialNumber;
        this.color = color;
        this.brand = brand;
        this.tankVolume = tankVolume;
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void drive(int speed) {
        System.out.println("Ich fahre?");
        engine.drive(speed);
        this.fuelAmount -= (this.fuelConsumption * speed);
    }
    
    public void brake(int amount) {
        System.out.println("Ich bremse!");
    }
    
    public void turboBoost() {
        if (this.fuelAmount / this.tankVolume >= 0.10) {
            System.out.println("Super Boost Mode !!! \uD83D\uDE80");
        } else {
            System.out.println("Not enought fuel to go Superboost :(");
        }
    }
    
    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut \uD83D\uDCEF");
        }
    }
    
    public double getRemainingRange() {
        double remainingRange = fuelAmount / fuelConsumption;
        System.out.println("Range left: " + remainingRange);
        return remainingRange;
    }
    
    public void addMirrors(Mirror mirror) {
        this.mirrors.add(mirror);
    }
    
    public List<Mirror> getMirrors() {
        return mirrors;
    }
}
