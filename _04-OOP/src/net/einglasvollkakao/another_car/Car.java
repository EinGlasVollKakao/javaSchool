package net.einglasvollkakao.another_car;

public class Car {
    private String color;
    private double maxSpeed;
    private double basePrice;
    private double baseConsumption;
    private double mileage;
    private Producer producer;
    private Engine engine;
    
    private double price;
    
    public Car(String color, double maxSpeed, double basePrice, double baseConsumption, Producer producer, Engine engine) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.producer = producer;
        this.engine = engine;
        
        this.price = (1 - this.producer.getRabatt()) * this.basePrice;
    }
    
    public double getConsumption() {
        if (this.mileage <= 50000) {
            return this.baseConsumption;
        } else {
            return this.baseConsumption * 109.8;
        }
    }
    
    public String getColor() {
        return color;
    }
    
    public double getMaxSpeed() {
        return maxSpeed;
    }
    
    public double getMileage() {
        return mileage;
    }
    
    public Producer getProducer() {
        return producer;
    }
    
    public Engine getEngine() {
        return engine;
    }
    
    public double getPrice() {
        return price;
    }
}
