package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AutoTest {

    @Test
    void accelerate() {
        //GIVEN
        Auto auto = new Auto();
        //WHEN
        int actual = auto.accelerate(35);
        //THEN
        Assertions.assertEquals(35,actual);
    }

    @Test
    void isItAccelerating() {
        //GIVEN
        Auto auto = new Auto();
        auto.accelerate(35);
        //WHEN
        int actual = auto.getVelocity();
        //THEN
        Assertions.assertEquals(35,actual);
    }
}