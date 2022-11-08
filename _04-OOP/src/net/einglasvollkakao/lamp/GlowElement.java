package net.einglasvollkakao.lamp;

public class GlowElement {
    private String name;
    private String color;
    private double powerConsumption;
    private boolean status = false;
    
    public GlowElement(String name, String color, double powerConsumption, boolean status) {
        this.name = name;
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.status = status;
    }
    
    public void turnOn() {
        if (!this.status) {
            this.status = true;
            this.powerConsumption += 5;
        } else {
            System.out.println("Mein name ist " + this.name + ". Ich bin bereits eingeschaltet.\uD83D\uDCA6");
        }
    }
    
    
    public String getName() {
        return name;
    }
    
    public String getColor() {
        return color;
    }
    
    public double getPowerConsumption() {
        return powerConsumption;
    }
    
    public boolean getStatus() {
        return status;
    }
    
    
}
