package net.einglasvollkakao.car;

public class Truck extends Car {
    private boolean hasTrailer = false;

    public Truck(Engine engine, String serialNumber, String color, String brand, double tankVolume, double fuelConsumption, double fuelAmount, boolean hasTrailer) {
        super(engine, serialNumber, color, brand, tankVolume, fuelConsumption, fuelAmount);
        this.hasTrailer = hasTrailer;
    }

    public boolean getHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    @Override
    public void drive(int speed) {
        System.out.println("Ich bin ein krasser Truck – Brumm Brumm");
        super.drive(speed);
    }
}
