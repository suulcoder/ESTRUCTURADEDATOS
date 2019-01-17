package com.company;

import static org.junit.Assert.*;

public class AparatoRadialTest {

    AparatoRadial radio = new AparatoRadial();

    @org.junit.Test
    public void getState() {
        radio.toggle();
        assertEquals(false,radio.getState());
    }

    @org.junit.Test
    public void getFrequency() {
        radio.changeFrequency();
        assertEquals(true,radio.getFrequency());
    }

   @org.junit.Test
    public void getStation() {
        radio.changeStation(true);
        assertEquals(88.1,radio.getStation(),radio.getStation());
    }
}
