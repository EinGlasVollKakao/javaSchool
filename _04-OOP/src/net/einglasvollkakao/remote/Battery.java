package net.einglasvollkakao.remote;

public class Battery {
    private int chargingStatus = 100;
    
    public int getChargingStatus() {
        return chargingStatus;
    }
    
    public void setChargingStatus(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }
    
    public void turnOn() {
        if (chargingStatus >= 5) {
            chargingStatus -= 5;
            System.out.println("Verbraucher angeschlossen");
        }
    }
    
    public void turnOff() {
        System.out.println("Kein Verbraucher angeschlossen");
    }
}
