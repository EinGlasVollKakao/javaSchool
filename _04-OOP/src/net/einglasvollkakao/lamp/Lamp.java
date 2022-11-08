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
}
