package de.neuefische;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.accelerate(35);
        auto.accelerate(25);

        Fahrrad fahrrad = new Fahrrad();
        fahrrad.accelerate(35);
        fahrrad.accelerate(15);
        fahrrad.accelerate(15);
        fahrrad.accelerate(15);
    }
}