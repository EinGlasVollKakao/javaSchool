package net.einglasvollkakao.car;

public class Engine {
    private int horsePower;
    public enum TYPE {DIESEL, GAS}
    private TYPE engineType;
    
    public Engine(int horsePower, TYPE engineType) {
        this.horsePower = horsePower;
        this.engineType = engineType;
    }
    
    /*
     * amount should be between 0 and 100
     */
    public void drive(int amount) {
        System.out.println("The motor is running with: " + amount);
    }
    
    public int getHorsePower() {
        return horsePower;
    }
    
    public TYPE getEngineType() {
        return engineType;
    }
}
