package net.einglasvollkakao.another_car;

public class Main {
    public static void main(String[] args) {
    
        Engine engine1 = new Engine(Engine.Type.GAS, 69);
        Producer tesla = new Producer("Tesla", "USA", 0.1);
        Car car1 = new Car("Coyote Brown", 320, 230.90, 10, tesla, engine1);
    
        System.out.println(car1.getConsumption());
        System.out.println(car1.getPrice());
    }
}
