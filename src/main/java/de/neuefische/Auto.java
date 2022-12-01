package de.neuefische;


public class Auto extends Vehicle{

    public Auto() {
    }

    @Override
    public int accelerate(int kmh) {
        int vel = super.getVelocity();
        setVelocity(vel += kmh);
        System.out.println("Das Auto hat jetzt eine Endgeschwindigkeit von: " + super.getVelocity());
        return vel;
    }
}
