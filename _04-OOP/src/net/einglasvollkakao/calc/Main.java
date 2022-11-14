package net.einglasvollkakao.calc;

public class Main {
    public static void main(String[] args) {
        Calculator calci = new Calculator();
        ScienceCalculator smartCalci = new ScienceCalculator();
        RootCalculator wurzelZieher = new RootCalculator();

        System.out.println(calci.add(1, 3.5));
        System.out.println(wurzelZieher.sqrt(25));
        System.out.println(smartCalci.add(0.5, 1.5));
        System.out.println(smartCalci.sin(10));

    }
}
