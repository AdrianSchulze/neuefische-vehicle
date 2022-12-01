package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FahrradTest {

    @Test
    void accelerate() {
        //given
        Fahrrad fahrrad = new Fahrrad();
        int kmh = 36;
        //when
        int actual = fahrrad.accelerate(kmh);
        //then
        Assertions.assertEquals(0,actual);
    }
}