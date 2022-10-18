package net.einglasvollkakao.remote;

public class Remote {
    private String color;
    private Battery battery1;
    private Battery battery2;
    
    public Remote(String color) {
        this.color = color;
    }
    
    public Battery getBattery1() {
        return battery1;
    }
    
    public void setBattery1(Battery battery1) {
        this.battery1 = battery1;
    }
    
    public Battery getBattery2() {
        return battery2;
    }
    
    public void setBattery2(Battery battery2) {
        this.battery2 = battery2;
    }
    
    public int getStatus() {
        return (battery1.getChargingStatus() + battery2.getChargingStatus()) / 2;
    }
    
    public void turnOn() {
        if (this.getStatus() >= 10) {
            battery1.turnOn();
            battery2.turnOn();
        } else {
            System.out.println("Nicht genug Batterie \uD83E\uDEAB");
        }
    }
    
    public void turnOff() {
        battery1.turnOff();
        battery2.turnOff();
    }
}
