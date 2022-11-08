package net.einglasvollkakao.lamp;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        GlowElement element1 = new GlowElement("erstes Glüh Element", "rot");
        GlowElement element2 = new GlowElement("ich bin zwei", "grün");
        lamp.addGlowElement(element1);
        lamp.addGlowElement(element2);

        lamp.turnAllOn();

        lamp.turnAllOn();
        lamp.turnAllOn();
        lamp.turnAllOn();
        lamp.turnAllOn();

        System.out.println(lamp.getOverallPowerUsage());

        lamp.printNamesOfLightElements();
    }
}
