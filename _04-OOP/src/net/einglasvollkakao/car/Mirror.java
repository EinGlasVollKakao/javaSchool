package net.einglasvollkakao.car;

public class Mirror {
    public enum POSITION {RIGHT, LEFT, REAR}
    private POSITION mirrorPos;
    private int size;
    private boolean folded = true;
    
    public Mirror(POSITION mirrorPos, int size) {
        this.mirrorPos = mirrorPos;
        this.size = size;
    }
    
    public void toggleFold() {
        if (folded) {
            System.out.println(this.mirrorPos + " UNFOLDING");
        } else {
            System.out.println("Hol ihn rein, Rüdiger " + this.mirrorPos);
        }
        folded = !folded;
    }
}
