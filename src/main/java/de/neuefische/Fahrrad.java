package de.neuefische;

public class Fahrrad extends Vehicle{

    @Override
    public int accelerate(int kmh) {
        int vel = getVelocity();
        if((vel + kmh) < 35) {
            setVelocity(vel += kmh);
            System.out.println("Das Fahrrad hat jetzt eine Endgeschwindigkeit von: " + vel);
        }
        else
        {
            System.out.println("Kann nicht schneller als 35 Kmh");
        }
        return vel;
    }
}
