package net.einglasvollkakao.car;

public class Main {
    public static void main(String[] args) {
        
        Engine engineX = new Engine(100, Engine.TYPE.DIESEL);
        Car car1 = new Car(engineX, "123452345", "black", "edison",
                300, 2, 300);
        
        car1.drive(10);
        car1.getRemainingRange();
        car1.honk(2);
        
        car1.brake(1);
        
        car1.turboBoost();
        
        
        Mirror rightMirror = new Mirror(Mirror.POSITION.RIGHT, 10);
        Mirror leftMirror = new Mirror(Mirror.POSITION.LEFT, 10);
        Mirror rearMirror = new Mirror(Mirror.POSITION.REAR, 10);
    
        car1.addMirrors(rightMirror);
        car1.addMirrors(leftMirror);
        car1.addMirrors(rearMirror);
        
        car1.getMirrors().get(0).toggleFold();

        Engine manuelsEngine = new Engine(100, Engine.TYPE.DIESEL);
        Truck manuel = new Truck(manuelsEngine, "s324234", "rot", "Mercedes", 100, 10, 1, true);

        System.out.println(manuel.getHasTrailer());
        manuel.drive(12);
        
    }
}