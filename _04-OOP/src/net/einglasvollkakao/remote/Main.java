package net.einglasvollkakao.remote;

public class Main {
    public static void main(String[] args) {
        Battery b1 = new Battery();
        Battery b2 = new Battery();
        
        Remote remote = new Remote("dark slate blue");
        
        remote.setBattery1(b1);
        remote.setBattery2(b2);
        
        remote.turnOn();
        remote.turnOn();
        remote.turnOff();
    
        System.out.println(remote.getStatus());
    }
}
