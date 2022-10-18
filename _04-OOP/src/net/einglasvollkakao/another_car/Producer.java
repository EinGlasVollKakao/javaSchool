package net.einglasvollkakao.another_car;

public class Producer {
    private String name;
    private String originCountry;
    private double rabatt;
    
    public Producer(String name, String originCountry, double rabatt) {
        this.name = name;
        this.originCountry = originCountry;
        this.rabatt = rabatt;
    }
    
    public String getName() {
        return name;
    }
    
    public String getOriginCountry() {
        return originCountry;
    }
    
    public double getRabatt() {
        return rabatt;
    }
}
