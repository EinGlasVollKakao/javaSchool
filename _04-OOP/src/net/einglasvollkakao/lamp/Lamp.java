package net.einglasvollkakao.lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<GlowElement> glowElements = new ArrayList<>();

    public void addGlowElement(GlowElement element) {
        glowElements.add(element);
    }

    public void turnAllOn() {
        for (GlowElement element : glowElements) {
            element.turnOn();
        }
    }

    public double getOverallPowerUsage() {
        double sum = 0;

        for (GlowElement element : glowElements) {
            sum += element.getPowerConsumption();
        }
        return sum;
    }

    public void printNamesOfLightElements() {
        for (GlowElement element : glowElements) {
            System.out.println(element.getName());
        }
    }

}
