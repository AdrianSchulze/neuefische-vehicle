package de.neuefische;

import lombok.Data;

@Data
abstract class Vehicle implements Accelerateable{
    private int id;
    private String name;
    private int velocity;
    public Vehicle() {

    }

}
